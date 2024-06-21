def solution(n):
    result = []
    li = list(reversed(str(n)))
    for i in li:
        result.append(int(i))
    return result
        
