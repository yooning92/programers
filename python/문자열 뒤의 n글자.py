def solution(my_string, n):
    answer = ''
    str = list(my_string)
    for i in range(n):
        answer += str[i-n]
    return answer