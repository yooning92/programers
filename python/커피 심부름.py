def solution(order):
    americano = 0
    latte = 0
    for i in order:
        if "americano" in i:
            americano += 1
        elif "latte" in i:
            latte += 1
        elif "anything" in i :
            americano += 1
    return americano * 4500 + latte * 5000