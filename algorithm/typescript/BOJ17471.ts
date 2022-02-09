// problem : https://www.acmicpc.net/problem/17471

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const N: number = Number(input[0]);
const peopleCount: number[] = input[1].split(" ").map(Number);
const isSelected: boolean[] = new Array(N + 1).fill(false);
const adjMatrix: number[][] = new Array();
let answer: number = Number.MAX_SAFE_INTEGER;

for (let i = 0; i <= N; i++) {
  const row: number[] = new Array(N + 1).fill(0);
  adjMatrix.push(row);
}

for (let i = 2; i <= N + 1; i++) {
  const data: number[] = input[i].split(" ").map(Number);
  for (let j = 1; j <= data[0]; j++) {
    const col: number = data[j];
    adjMatrix[i - 1][col] = adjMatrix[col][i - 1] = 1; // 인접행렬 초기화
  }
}

function BFS(start: number, visited: boolean[]): void {
  let queue: number[] = new Array();
  queue.push(start);
  visited[start] = true;

  while (queue.length != 0) {
    let index: number = queue.shift();

    for (let i = 1; i <= N; i++) {
      if (!visited[i] && adjMatrix[index][i] === 1 && isSelected[start] === isSelected[i]) {
        queue.push(i);
        visited[i] = true;
      }
    }
  }
}

function divide(cnt: number, total: number): void {
  if (cnt === N + 1) {
    if (total === N || total === 0) {
      return;
    }
    let blueStart: number = 0;
    let redStart: number = 0;

    for (let i = 1; i <= N; i++) {
      if (isSelected[i]) {
        blueStart = i;
        break;
      }
    }

    for (let i = 1; i <= N; i++) {
      if (!isSelected[i]) {
        redStart = i;
        break;
      }
    }

    const visited: boolean[] = new Array(N + 1).fill(false);

    BFS(blueStart, visited);
    BFS(redStart, visited);

    for (let i = 1; i <= N; i++) {
      if (!visited[i]) {
        return;
      }
    }

    let redPeople: number = 0;
    let bluePeople: number = 0;

    for (let i = 1; i <= N; i++) {
      if (isSelected[i]) {
        bluePeople += peopleCount[i - 1];
      } else {
        redPeople += peopleCount[i - 1];
      }
    }

    answer = Math.min(answer, Math.abs(bluePeople - redPeople));

    return;
  }

  isSelected[cnt] = true;
  divide(cnt + 1, total + 1);
  isSelected[cnt] = false;
  divide(cnt + 1, total);
}

divide(1, 0);
console.log(answer === Number.MAX_SAFE_INTEGER ? -1 : answer);
