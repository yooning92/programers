def solution(num_str):
    answer = 0
    num_str = ','.join(num_str).split(',')
    for i in num_str:
        answer += int(i)
    return answer