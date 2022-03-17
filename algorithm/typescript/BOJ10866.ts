// problem : https://www.acmicpc.net/problem/10866

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");
const N: number = Number(input[0]);
const deque: number[] = new Array();
const answer: number[] = new Array();

for (let i = 1; i <= N; i++) {
  const cmd: string = input[i];

  if (cmd.startsWith("push_front")) {
    const num: number = Number(cmd.substring(cmd.indexOf(" ") + 1, cmd.length));
    deque.unshift(num);
  } else if (cmd.startsWith("push_back")) {
    const num: number = Number(cmd.substring(cmd.indexOf(" ") + 1, cmd.length));
    deque.push(num);
  } else if (cmd.startsWith("pop_front")) {
    if (deque.length === 0) {
      answer.push(-1);
    } else {
      const num: number[] = deque.splice(0, 1);
      answer.push(num[0]);
    }
  } else if (cmd.startsWith("pop_back")) {
    if (deque.length === 0) {
      answer.push(-1);
    } else {
      const num: number = deque.pop()
      answer.push(num);
    }
  } else if (cmd.startsWith("size")) {
    answer.push(deque.length);
  } else if (cmd.startsWith("empty")) {
    if (deque.length === 0) {
      answer.push(1);
    } else {
      answer.push(0);
    }
  } else if (cmd.startsWith("front")) {
    if (deque.length === 0) {
      answer.push(-1);
    } else {
      answer.push(deque[0]);
    }
  } else {
    if (deque.length === 0) {
      answer.push(-1);
    } else {
      answer.push(deque[deque.length - 1]);
    }
  }
}

console.log(answer.join("\n"));
