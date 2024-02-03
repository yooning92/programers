const solution = (num_list) => {
    let answer = [];
    const sorted_num_list = num_list.sort((a, b) => a - b);
    for(let i = 0; i < num_list.length; i++) {
        if(i >= 5) {
            answer.push(sorted_num_list[i]);
        }
    }
    return answer;
}