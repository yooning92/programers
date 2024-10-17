const solution = (keyinput, board) => {
    let res = [0, 0];
    for(let k of keyinput) {
        switch(k) {
            case 'left' : if (-res[0] < board[0] / 2-1) res[0]--; break;
            case 'right' : if (res[0] < board[0] / 2-1) res[0]++; break;
            case 'up' : if (res[1] < board[1] / 2-1) res[1]++; break;
            case 'down' : if (-res[1] < board[1] / 2-1) res[1]--; break;
        }
    }
    return res;
}