const solution = (arr, n) => arr.map((v, idx) => arr.length % 2 !== idx % 2 ? v + n : v)