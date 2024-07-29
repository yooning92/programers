const solution = (s) => {
    let answer = '';
    let sList = s.split(' ');
    for(let word of sList) {
        for(let i = 0; i < word.length; i++) {
            i % 2 == 1 ? answer += word[i].toLowerCase() : answer += word[i].toUpperCase()
        }
        answer += ' '
    }
    return answer.slice(0 , -1);
}