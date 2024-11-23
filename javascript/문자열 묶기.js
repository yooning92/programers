const solution = (strArr) => {
    const dict = {};
    strArr.forEach(item => {
        const len = item.length;
        if(dict[len] == null && dict[len] == undefined) {
            dict[len] = [];
        }
        dict[len].push(item);
    });
    const values = Object.values(dict).map(a => a.length);
    return Math.max(...values);
}