const solution = (my_string) => {
    let answer = [];
    let alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    let arr = [];
    arr.length = 52;
    arr.fill(0);

    my_string.split("").map((n) => {
        arr[alphabet.indexOf(n)] += 1
    })

    return arr;
}