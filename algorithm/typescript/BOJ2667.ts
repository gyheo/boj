// problem : https://www.acmicpc.net/problem/2667

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().trim().split("\n");
const N: number = Number(input[0]);
const map: number[][] = new Array();
const visited: boolean[][] = new Array();
const answer: number[] = new Array();
const dx: number[] = [-1, 1, 0, 0];
const dy: number[] = [0, 0, -1, 1];
let count: number = 1;

for (let i = 1; i <= N; i++) {
  const mapRow: number[] = input[i].split("").map(Number);
  const visitedRow: boolean[] = new Array(N).fill(false);
  map.push(mapRow);
  visited.push(visitedRow);
}

for (let i = 0; i < N; i++) {
  for (let j = 0; j < N; j++) {
    if (map[i][j] === 1 && !visited[i][j]) {
      count = 1;
      dfs(i, j);
      answer.push(count);
    }
  }
}

function dfs(x: number, y: number): void {
  visited[x][y] = true;

  for (let i = 0; i < 4; i++) {
    let nx: number = x + dx[i];
    let ny: number = y + dy[i];

    if (nx < 0 || ny < 0 || nx >= N || ny >= N || map[nx][ny] === 0 || visited[nx][ny]) {
      continue;
    }

    count++;
    dfs(nx, ny);
  }
}

console.log(answer.length);
answer.sort((a, b) => {
  return a - b;
});
console.log(answer.join("\n"));
