def solution(arr, n):
    answer = []
    for i in range(len(arr)):
        if len(arr) % 2 == 1: 
            if i % 2 == 0:
                answer.append(arr[i]+n)
            else:
                answer.append(arr[i])
        else:
            if i % 2 == 0:
                answer.append(arr[i])
            else:
                answer.append(arr[i]+n)
    return answer