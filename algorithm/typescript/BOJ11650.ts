// problem : https://www.acmicpc.net/problem/11650

import fs = require("fs");

class Point {
  x: number;
  y: number;

  constructor(x: number, y: number) {
    this.x = x;
    this.y = y;
  }
}

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const N = Number(input[0]);
const points: Point[] = [];

for (let i = 1; i <= N; i++) {
  const inputData: number[] = input[i].split(" ").map(Number);
  const p = new Point(Number(inputData[0]), Number(inputData[1]));
  points.push(p);
}

points.sort((p1: Point, p2: Point) => {
  let value = p1.x - p2.x;

  if (value === 0) {
    value = p1.y - p2.y;
  }

  return value;
});

console.log(points.map((point) => `${point.x} ${point.y}`).join("\n"));
