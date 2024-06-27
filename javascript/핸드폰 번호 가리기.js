const solution = (phone_number) => {
    let answer = '';
    let li = phone_number.split('');
    for(let num = 0; num < li.length; num++) {
        if(num < li.length - 4) {
            answer += '*';
        }else {
            answer += li[num];
        }
    }
    return answer;
}