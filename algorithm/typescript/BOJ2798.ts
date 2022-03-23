// problem : https://www.acmicpc.net/problem/2798

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");

const BLACKJACK_COUNT: number = 3;
const data: number[] = input[0].split(" ").map(Number);
const N: number = Number(data[0]);
const M: number = Number(data[1]);
const cards: number[] = input[1].split(" ").map(Number);
const selected: number[] = new Array(3).fill(0);
let answer: number = Number.MIN_SAFE_INTEGER;

function select(count: number, start: number) {
  if (count === BLACKJACK_COUNT) {
    let sum: number = 0;

    for (let i = 0; i < BLACKJACK_COUNT; i++) {
      sum += selected[i];
    }

    if (sum <= M && sum > answer) {
      answer = sum;
    }

    return;
  }

  for (let i = start; i < N; i++) {
    selected[count] = cards[i];
    select(count + 1, i + 1);
  }
}

select(0, 0);
console.log(answer);
