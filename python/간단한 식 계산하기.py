def solution(binomial):
    question = binomial.split(" ")
    a = int(question[0])
    b = question[1]
    c = int(question[2])
    
    if(b == '+'):
        return a + c
    elif(b == '-'):
        return a - c
    elif(b == '*'):
        return a * c
