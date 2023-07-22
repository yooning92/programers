def solution(num, k):
    answer = -1
    k = str(k)
    for i in str(num) :
        if i != k :
            pass
        elif i == k :
            answer = (str(num).index(i))+1
    return answer