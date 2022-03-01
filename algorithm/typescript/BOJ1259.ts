// https://www.acmicpc.net/problem/1259

import fs = require("fs");

const input: string[] = fs.readFileSync("/dev/stdin").toString().trim().split("\n");
const answer: string[] = new Array();

input.forEach((data) => {
  if (data === "0") {
    return;
  }

  const reversedString: string = data.split("").reverse().join("");

  if (reversedString === data) {
    answer.push("yes");
  } else {
    answer.push("no");
  }
});

console.log(answer.join("\n"));
