def solution(slice, n):
    if n % slice == 0:
        return int(n / slice)
    else:
        return int(n / slice) + 1