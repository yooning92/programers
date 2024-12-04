const solution = (arr) => {
    let x = 0;
    let prev = arr;
    
    while(true) {
        const check = prev.map(a => {
            if(a >= 50 && a % 2 === 0) {
                return a / 2;  
            }else if(a < 50 && a % 2 === 1) {
                return a * 2 + 1;
            }else {
                return a;
            }
        });
        
        const isSame = prev.every((a, i) => a === check[i]);
        if(isSame) {
            break;
        }
        x += 1;
        prev = check;
    }
    return x;
  }