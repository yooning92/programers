def solution(a, b):
    maxNum = max(a, b)
    minNum = min(a, b)
    count = 1
    while count > 0:
        count = maxNum % minNum
        maxNum = minNum
        minNum = count
    answer = [maxNum, int(a * b / maxNum)]
    return answer