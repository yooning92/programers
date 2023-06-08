def solution(num_list):
    answer = 0
    mul = 1
    total = 0
    for i in num_list:
        mul *= i
        total += i
    if(mul<=(total**2)):
        answer = 1
    else:
        answer = 0
    return answer