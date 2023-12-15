def solution(arr, idx):
    answer = -1
    for i in range(idx, len(arr), 1):
        if(arr[i] == 1):
            answer += i+1
            break
    return answer