const solution = (arr, k) => {
    let a = new Set(arr);
    let answer = [...a].slice(0, k);
    while(answer.length !== k) {
        answer.push(-1);
    }
    return answer;
}