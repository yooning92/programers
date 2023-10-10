def solution(n_str):
    answer = ''
    num_list = ''.join(n_str)
    for i in range(len(num_list)):
        if num_list[i] != '0':
            answer += num_list[i:]
            break
    return answer