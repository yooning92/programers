def solution(num_list, n):
    answer = []
    list_left  = []
    list_right = []
    for i in range(len(num_list)):
        if(i < n):
            list_left.append(num_list[i])
        else:
            list_right.append(num_list[i])
    answer += (list_right + list_left)
    return answer