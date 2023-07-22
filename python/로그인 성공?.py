def solution(id_pw, db) :
    answer = 'fail'
    id = id_pw[0]
    pw = id_pw[1]
    for i in db :
        if id == i[0] :
            if pw == i[1] :
                answer = 'login'
            else :
                answer = 'wrong pw'
    return answer