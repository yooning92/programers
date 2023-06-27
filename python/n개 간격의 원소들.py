def solution(num_list, n):
    answer = []
    idx = 0
    for i in range(len(num_list)) :
        if idx <= len(num_list)-1 :
            answer.append(num_list[idx])
            idx += n
        else :
            break
    return answer