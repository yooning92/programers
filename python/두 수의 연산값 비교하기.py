def solution(a, b):
    plus = str(a) + str(b)
    calculate = 2 * a * b
    if int(plus) >= calculate :
        return int(plus)
    else :
        return calculate