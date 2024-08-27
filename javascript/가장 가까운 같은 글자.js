const solution = (s) => {
    let result = [];
    let check = [];
    for(let i = 0; i < s.length; i++){
        if(!check.includes(s[i])){
            result.push(-1);
            check.push(s[i]);
        } else if(check.includes(s[i])){
            result.push(i - check.lastIndexOf(s[i]));
            check.push(s[i]);
        }
    }
 	return result;
}