def solution(num):
    count = 0
    while(count <= 500):
        if(num == 1):
            return count
        elif(num % 2 == 0):
            num = num / 2
        else:
            num = num * 3 + 1
        count = count + 1
    return -1
