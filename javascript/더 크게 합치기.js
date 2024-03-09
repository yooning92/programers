const solution = (a, b) => {
    a = a.toString();
    b = b.toString();
    ab = parseInt(a+b);
    ba = parseInt(b+a);
    
    if(ab > ba) {
        return ab;
    }else {
        return ba;
    }
}