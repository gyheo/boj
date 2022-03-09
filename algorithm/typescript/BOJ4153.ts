// https://www.acmicpc.net/problem/4153

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().trim().split("\n");
const answer: string[] = new Array();

input.forEach((data) => {
  const sideList: number[] = data.split(" ").map(Number);
  sideList.sort((a, b) => {
    return a - b;
  });

  if (sideList[0] == 0 && sideList[1] == 0 && sideList[2] == 0) {
    return false;
  }

  if (sideList[2] ** 2 == sideList[0] ** 2 + sideList[1] ** 2) {
    answer.push("right");
  } else {
    answer.push("wrong");
  }
});

console.log(answer.join("\n"));
