const solution = (binomial) => {
    const s = binomial.split(" ");
    const op = s[1];
    const n1 = parseInt(s[0]);
    const n2 = parseInt(s[2]);
    
    if(op == "+") {
        return n1 + n2;
    }else if(op == "-"){
        return n1 - n2;
    }else {
        return n1 * n2;
    }
}