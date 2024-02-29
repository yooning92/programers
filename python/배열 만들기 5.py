def solution(intStrs, k, s, l):
    answer = []
    for i in intStrs:
        element = int(i[s:s+l])
        if(element > k):
            answer.append(element)
    return answer