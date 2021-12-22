// from https://www.acmicpc.net/problem/1001

import fs = require('fs')

let input = fs.readFileSync('/dev/stdin').toString().split(' ');
let a: number = parseInt(input[0]);
let b: number = parseInt(input[1]);

console.log(a - b);