def solution(num_list, n):
    answer = []
    count = 0
    for i in num_list:
        count += 1
        if(count <= n):
            answer.append(i)
    return answer
