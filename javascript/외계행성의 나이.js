const solution = (age) => {
    let answer = '';
    strAge = 'abcdefghij';
    for(let i of age.toString()) {
        answer += strAge[parseInt(i)];
    }
    return answer;
}