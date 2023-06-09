def solution(n, k):
    answer = []
    count = 1
    for i in range(n+1):
        if(i == k*count):
            answer.append(i)
            count += 1
    return answer