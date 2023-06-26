def solution(myString):
    answer = ''
    for my in myString :
        if ord(my) < 108 :
            answer += 'l'
        else :
            answer += my
    return answer