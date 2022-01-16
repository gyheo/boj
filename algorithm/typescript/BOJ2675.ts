// problem : https://www.acmicpc.net/problem/2675

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const T: number = Number(input[0]);
const result: string[] = [];

for (let i = 1; i <= T; i++) {
  const inputData: string[] = input[i].split(" ");
  const cnt: number = Number(inputData[0]);
  let output: string = "";

  for (let j = 0, len = inputData[1].length; j < len; j++) {
    for (let k = 0; k < cnt; k++) {
      output += inputData[1].charAt(j);
    }
  }

  result.push(output);
}

console.log(result.join("\n"));
