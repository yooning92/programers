const solution = (numbers, n) => {
    let answer = 0;
    for(let i of numbers) {
        if(answer <= n){
            answer += i;
        }else {
            break;
        }
    }
    return answer;
}