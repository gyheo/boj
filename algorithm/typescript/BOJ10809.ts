// problem : https://www.acmicpc.net/problem/10809

import fs = require("fs");

const inputString: string = fs.readFileSync("/dev/stdin").toString();
const alphabet: number[] = new Array(26).fill(-1);

for (let i = 0, size = inputString.length; i < size; i++) {
  if (alphabet[inputString.charCodeAt(i) - 97] === -1) {
    alphabet[inputString.charCodeAt(i) - 97] = i;
  }
}

console.log(alphabet.join(" "));
