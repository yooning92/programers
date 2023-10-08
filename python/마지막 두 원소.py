def solution(num_list):
    answer = num_list
    last1 = num_list[len(num_list)-1]
    last2 = num_list[len(num_list)-2]
    if(last2 < last1):
        answer.append(last1 - last2)
    else:
        answer.append(last1 * 2)
    return answer