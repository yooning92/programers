const solution = (date1, date2) => {
    let strDate1 = "";
    let strDate2 = "";
    
    for(let i = 0; i < date1.length; i++) {
        strDate1 += date1[i];
        strDate2 += date2[i];
    }
    
    if(parseInt(strDate1) < parseInt(strDate2)) {
        return 1;
    }else {
        return 0;
    }
}