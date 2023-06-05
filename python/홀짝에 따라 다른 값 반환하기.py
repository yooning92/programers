def solution(n):
    answer = 0
    odd = 0
    even = 0
    
    for i in range(n+1):
        if(i%2==1):
            odd+=i
        else:
            even+=(i**2)
    if(n%2==1):
        answer = odd
    else:
        answer = even
    return answer
