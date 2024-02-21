const solution = (num_list) => {
    let answer = 0;
    for(i of num_list) {
        let num = i;
        while(num != 1) {
            num = num%2 == 0 ? num/2 : (num-1)/2
            answer++;
        }
    }
    return answer;
}