const solution = (num_list) => {
    let mul = 1;
    let total = 0;
    for(let i = 0; i < num_list.length; i++) {
        mul *= num_list[i];
        total += num_list[i];
    }
    if(mul <= (total**2)) {
        return 1;
    }else {
        return 0;
    }
}