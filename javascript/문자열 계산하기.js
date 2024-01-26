const solution = (my_string) => {
    let answer = 0;
    let strArr = [];
    strArr = my_string.split(" ");
    answer += parseInt(strArr[0]);
    for(let i = 1 ; i < strArr.length ; i++){
        if(i%2 != 0){
            if(strArr[i] == "+"){
                answer += parseInt(strArr[i+1]);
            } else {
                answer -= parseInt(strArr[i+1]);
            }
        }
    }
    return answer;
}