const solution = (n) => {
    let answer = 1;
    let i = 1;
    while(i <= n) {
        answer += 1;
        i *= answer;
    }
    return answer-1;
}