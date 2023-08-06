def solution(my_string):
    answer = []
    for i in my_string:
        if i <= "9":
            answer.append(int(i))
    return sorted(answer)