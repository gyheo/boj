// from https://www.acmicpc.net/problem/15650

import fs = require('fs')

let str: string[] = fs.readFileSync('/dev/stdin').toString().split(' ');
let N: number = parseInt(str[0]);
let M: number = parseInt(str[1]);

let input = [];
for (let i = 1; i <= N; i++) {
	input.push(i);
}
let output = [];
let result = [];

function combination(cnt: number, start: number): void {
	if (cnt == M) {
		for (let i = 0; i < M; i++) {
			result.push(`${output[i]} `);
		}
		result.push(`\n`);
		return;
	}

	for (let i = start; i < N; i++) {
		output[cnt] = input[i];
		combination(cnt + 1, i + 1);
	}
}

combination(0, 0);
console.log(result.join(''));
