const solution = (x) => {
    const arr = Array.from(String(x));
    let sum = 0;
    for(let c of arr) {
        sum += parseInt(c);
    }
    return x % sum === 0 ? true : false;
}