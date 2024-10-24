def solution(array, n):
    array.sort()
    a = [abs(i - n) for i in array]
    return array[a.index(min(a))]