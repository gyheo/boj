// problem : https://www.acmicpc.net/problem/2164

import fs = require("fs");

const N: number = Number(fs.readFileSync("/dev/stdin").toString());

const queue: number[] = Array.from({ length: N }, (_, index) => index + 1);

while (queue.length !== 1) {
  queue.splice(0, 1);
  const first: number[] = queue.splice(0, 1);
  queue.push(first[0]);
}

console.log(queue[0]);
