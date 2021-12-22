// from https://www.acmicpc.net/problem/15649

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
let isSelected = Array(N).fill(false);

function permutation(cnt: number): void {
	if (cnt == M) {
		for (let i = 0; i < M; i++) {
			result.push(`${output[i]} `);
		}
		result.push(`\n`);
		return;
	}

	for (let i = 0; i < N; i++) {
		if (isSelected[i]) continue;
		isSelected[i] = true;
		output[cnt] = input[i];
		permutation(cnt + 1);
		isSelected[i] = false;
	}
}

permutation(0);
console.log(result.join(''));
