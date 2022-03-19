// problem : https://www.acmicpc.net/problem/2309

import fs = require("fs");

const dwarfHeight: number[] = fs.readFileSync("/dev/stdin").toString().trim().split("\n").map(Number);
const N: number = dwarfHeight.length;
const OUTPUT_LENGTH: number = 7;
const HEIGHT_SUM: number = 100;
const output: number[] = Array(OUTPUT_LENGTH).fill(0);
let isAnswer: boolean = true; // 여러 정답 중 한 번만 출력할 수 있도록 조건 추가

function select(cnt: number, start: number): void {
  if (cnt === OUTPUT_LENGTH) {
    let heightSum = 0;

    for (let i = 0; i < OUTPUT_LENGTH; i++) {
      heightSum += output[i];
    }

    if (heightSum === HEIGHT_SUM && isAnswer) {
      isAnswer = false;

      output.sort((a, b) => {
        return a - b;
      });

      output.forEach((height) => {
        console.log(height);
      });
    }

    return;
  }

  for (let i = start; i < N; i++) {
    output[cnt] = dwarfHeight[i];
    select(cnt + 1, i + 1);
  }
}

select(0, 0);
