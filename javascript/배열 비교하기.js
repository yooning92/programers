const solution = (arr1, arr2) => {
    let lenArr1 = arr1.length;
    let lenArr2 = arr2.length;
    let sumArr1 = arr1.reduce((a, b) => a + b, 0);
    let sumArr2 = arr2.reduce((a, b) => a + b, 0);
    
    if(lenArr1 !== lenArr2) {
        return lenArr1 > lenArr2 ? 1 : -1;
    }else {
        if(sumArr1 === sumArr2) {
            return 0;
        }else {
            return sumArr1 > sumArr2 ? 1 : -1;
        }
    }
}