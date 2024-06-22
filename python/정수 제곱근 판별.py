import math

def solution(n):
    x = int(math.sqrt(n))
    if math.pow(x, 2) == n:
        return math.pow(x+1, 2)
    else:
        return -1