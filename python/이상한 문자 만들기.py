def solution(s):
    answer = ''
    sList = s.split(' ')
    for i in sList:
        for j in range(len(i)):
            if j % 2 == 1:
                answer += i[j].lower()
            else:
                answer += i[j].upper()
        answer += ' '
    return answer[:-1]