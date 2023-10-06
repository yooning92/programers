def solution(names):
    answer = []
    idx = 0
    for i in names:
        if(idx % 5 == 0):
            answer.append(names[idx])
        idx += 1
    return answer