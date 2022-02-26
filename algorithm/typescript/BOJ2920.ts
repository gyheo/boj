// problem : https://www.acmicpc.net/problem/2920

import fs = require("fs");

const arr: number[] = fs.readFileSync("/dev/stdin").toString().split(" ").map(Number);
const ascending: number[] = [1, 2, 3, 4, 5, 6, 7, 8];
const descending: number[] = [8, 7, 6, 5, 4, 3, 2, 1];

if (JSON.stringify(arr) === JSON.stringify(ascending)) {
  console.log("ascending");
} else if (JSON.stringify(arr) === JSON.stringify(descending)) {
  console.log("descending");
} else {
  console.log("mixed");
}
