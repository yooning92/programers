const solution = (start, end) => {
    let answer = [];
    for(let num = start; num >= end; num--) {
        answer.push(num);
    }
    return answer;
}