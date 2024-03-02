const solution = (intStrs, k, s, l) => {
    let answer = [];
    for(let i of intStrs) {
        let element = parseInt(i.substring(s, s+l));
        if(k < element){
            answer.push(element);
        }
    }
    return answer;
}