def solution(i, j, k):
    answer = 0
    for a in range(i, j+1):
        for b in str(a):
            if k == int(b):
                answer += 1
    return answer