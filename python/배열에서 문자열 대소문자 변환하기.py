def solution(strArr):
    answer = []
    count = 0
    for i in strArr:
        if(count%2 == 0):
            answer.append(strArr[count].lower())
        else:
            answer.append(strArr[count].upper())
        count += 1
    return answer