def solution(my_string, s, e):
    return my_string[0:s] + my_string[e:s-1:-1] + my_string[e+1:len(my_string)]