def solution(num_list):
    answer = 0
    result = 1
    for i in num_list:
        if(len(num_list)>=11):
            answer += i
        else:
            result *= i
            answer = result
    return answer
