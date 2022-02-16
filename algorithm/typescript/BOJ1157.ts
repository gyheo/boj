// problem : https://www.acmicpc.net/problem/1157

import fs = require("fs");

const input: string = fs.readFileSync("/dev/stdin").toString().toUpperCase();
const alphabetCnt: number[] = new Array(26).fill(0);

for (let i = 0, size = input.length; i < size; i++) {
  let index: number = input.charCodeAt(i);
  alphabetCnt[index - 65] += 1;
}
// console.log(alphabetCnt);

let maxCount: number = Number.MIN_SAFE_INTEGER;
let maxIndex: number = Number.MIN_SAFE_INTEGER;

for (let i = 0, size = alphabetCnt.length; i < size; i++) {
  if (maxCount < alphabetCnt[i]) {
    maxCount = alphabetCnt[i];
    maxIndex = i;
  }
}

let result: string = String.fromCodePoint(maxIndex + 65);

for (let i = 0, size = alphabetCnt.length; i < size; i++) {
  if (i != maxIndex && maxCount == alphabetCnt[i]) {
    result = "?";
    break;
  }
}

console.log(result);
