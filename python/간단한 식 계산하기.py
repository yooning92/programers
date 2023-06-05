def solution(binomial):
    count = 0
    question = binomial.split(" ")
    
    for i in question:
        if(count==0):
            a = int(question[count])
        elif(count==1):
            op = question[count]
        elif(count==2):
            b = int(question[count])
        count+=1
        
    if(op == '+'):
        return a + b
    elif(op == '-'):
        return a - b
    elif(op == '*'):
        return a * b
