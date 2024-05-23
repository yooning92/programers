const solution = (order) => {
    let americano = 0;
    let latte = 0;
    for(let data of order) {
        if(data.includes('americano')) {
            americano += 1;
        }else if(data.includes('latte')) {
            latte += 1;
        }else if(data.includes('anything')){
            americano += 1;
        }
    }
    return americano * 4500 + latte * 5000;
}