def solution(myString, pat):
    answer = 0
    for i, word in enumerate(myString):
        if myString[i:].startswith(pat):
            answer += 1
    return answer