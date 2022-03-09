// https://www.acmicpc.net/problem/10828

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const N: number = Number(input[0]);
const stack: number[] = new Array();
const answer: number[] = new Array();

for (let i = 1; i <= N; i++) {
  const cmd: string = input[i];

  if (cmd.startsWith("push")) {
    const num: number = Number(cmd.substr(5, cmd.length - 1));
    stack.push(num);
  } else if (cmd.startsWith("pop")) {
    if (stack.length === 0) {
      answer.push(-1);
    } else {
      answer.push(stack.pop());
    }
  } else if (cmd.startsWith("size")) {
    answer.push(stack.length);
  } else if (cmd.startsWith("empty")) {
    if (stack.length === 0) {
      answer.push(1);
    } else {
      answer.push(0);
    }
  } else {
    if (stack.length === 0) {
      answer.push(-1);
    } else {
      answer.push(stack[stack.length - 1]);
    }
  }
}

console.log(answer.join("\n"));
