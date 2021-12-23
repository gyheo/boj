// from https://www.acmicpc.net/problem/3040

import fs = require('fs');

const input = require('fs').readFileSync('/dev/stdin').toString().trim().split("\n");
const result = Array(7).fill(0);

function selectDwarf(cnt: number, start: number): void {
	if (cnt == 7) {
		let sum = 0;
		for (let i = 0; i < 7; i++) {
			sum += result[i];
		}

		if (sum == 100) {
			for (let i = 0; i < 7; i++) {
				console.log(result[i]);
			}
		}

		return;
	}

	for (let i = start; i < 9; i++) {
		result[cnt] = Number(input[i]);
		selectDwarf(cnt + 1, i + 1);
	}
}

selectDwarf(0, 0);