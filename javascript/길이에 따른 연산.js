const solution = (num_list) => {
    let answer = 0;
    for(let i of num_list) {
        if(num_list.length > 10) {
            answer += i;
        }else {
            if(answer == 0){
                answer = 1;
            }
            answer *= i;
        }
    }
    return answer;
}