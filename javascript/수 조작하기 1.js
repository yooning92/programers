const solution = (n, control) => {
    for(let word of control) {
        if(word === "w") {
            n += 1;
        }else if(word === "s") {
            n -= 1;
        }else if(word === "d") {
            n += 10;
        }else {
            n -= 10;
        }
    }
    return n;
}