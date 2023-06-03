def solution(num_list):
    answer = 0
    idx = 0
    for i in num_list:
        if(i<0):
            answer = idx
            break
        else:
            answer = -1
        idx += 1
    return answer
