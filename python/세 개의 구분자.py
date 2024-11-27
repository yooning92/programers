def solution(myStr):
    myStr = myStr.replace('a', ' ').replace('b', ' ').replace('c', ' ')
    if myStr.split():
        return myStr.split()
    else:
        return ["EMPTY"]