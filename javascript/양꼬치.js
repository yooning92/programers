function solution(n, k) {
    let a = parseInt(n/10);
    let answer = 12000*n + (2000*k-2000*a);
    return answer;
}