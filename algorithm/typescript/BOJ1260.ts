// from https://www.acmicpc.net/problem/1260

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const adjMatrix = [];
const inputData: string[] = input[0].split(" ");

const N: number = Number(inputData[0]);
const M: number = Number(inputData[1]);
const V: number = Number(inputData[2]);

const answer = [];

for (let i = 0; i < N + 1; i++) {
  adjMatrix.push(Array(N + 1).fill(0));
}

let visited = Array(N + 1).fill(false);

for (let i = 1; i <= M; i++) {
  const arr = input[i].split(" ").map(Number);
  const start = arr[0];
  const end = arr[1];

  adjMatrix[start][end] = adjMatrix[end][start] = 1;
}

function DFS(start: number): void {
  visited[start] = true;
  answer.push(`${start} `);

  for (let i = 1; i <= N; i++) {
    if (adjMatrix[start][i] === 1 && !visited[i]) {
      DFS(i);
    }
  }
}

function BFS(start: number): void {
  const queue = [];
  visited[start] = true;
  queue.push(start);

  while (queue.length != 0) {
    const vertex = queue.shift();
    answer.push(`${vertex} `);

    for (let i = 1; i <= N; i++) {
      if (adjMatrix[vertex][i] === 1 && !visited[i]) {
        visited[i] = true;
        queue.push(i);
      }
    }
  }
}

DFS(V);
answer.push(`\n`);
visited = Array(N + 1).fill(false); // visit 배열 초기화
BFS(V);
console.log(answer.join(""));
