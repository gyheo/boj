// problem : https://www.acmicpc.net/problem/10845

const fs = require("fs");

const inputData: string[] = fs.readFileSync("/dev/stdin").toString().split("\n");

const N: number = Number(inputData[0]);
const queue: number[] = new Array();
const answer: number[] = new Array();

for (let i = 1; i <= N; i++) {
  const cmd: string = inputData[i];

  if (cmd.startsWith("push")) {
    const num: number = Number(cmd.split(" ")[1]);
    queue.push(num);
  } else if (cmd.startsWith("pop")) {
    if (queue.length === 0) {
      answer.push(-1);
    } else {
      const num: number[] = queue.splice(0, 1);
      answer.push(num[0]);
    }
  } else if (cmd.startsWith("size")) {
    answer.push(queue.length);
  } else if (cmd.startsWith("empty")) {
    if (queue.length === 0) {
      answer.push(1);
    } else {
      answer.push(0);
    }
  } else if (cmd.startsWith("front")) {
    if (queue.length === 0) {
      answer.push(-1);
    } else {
      answer.push(queue[0]);
    }
  } else {
    if (queue.length === 0) {
      answer.push(-1);
    } else {
      answer.push(queue[queue.length - 1]);
    }
  }
}

console.log(answer.join("\n"));
