const solution = (numbers) => {
    let temp = [];
    let answer = [];
    for(let i = 0; i < numbers.length; i++) {
        for(let j = 0; j < numbers.length; j++) {
            if(i != j) {
                temp.push(numbers[i] + numbers[j]);
            }
        }
    }
    temp.forEach((item) => {
                    if(!answer.includes(item)) {
                        answer.push(item);
                    }
    });
    return answer.sort((a, b) => a - b);
}