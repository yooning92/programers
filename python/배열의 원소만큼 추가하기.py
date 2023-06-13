def solution(arr):
    answer = []
    count = 0
    
    for i in arr:
        for count in range(0, i ,1):
            answer.append(i)
    return answer