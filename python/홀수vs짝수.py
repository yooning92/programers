def solution(num_list):
    answer = 0
    idx = 0
    odd = 0
    even = 0
    
    for i in num_list:
        if(idx%2 == 0):
            even += i
        else:
            odd += i
        idx += 1
    if(even > odd):
        answer = even
    elif(even < odd):
        answer = odd
    else:
        answer = even or odd
    return answer
