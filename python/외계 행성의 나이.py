def solution(age):
    answer = ''
    strAge = 'abcdefghij'
    for i in str(age):
        answer += strAge[int(i)]
    return answer