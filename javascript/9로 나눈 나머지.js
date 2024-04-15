const solution = (number) => {
    let answer = 0;
    for(let i of number) {
        answer += parseInt(i);
    }
    return answer % 9;
}