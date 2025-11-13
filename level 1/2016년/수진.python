def solution(a, b):
    answer = ''
    day=[31,29,31,30,31,30,31,31,30,31,30,31]
    week=['THU', 'FRI', 'SAT','SUN','MON','TUE','WED']
    count=0
    for i in range(a-1):
        count+=day[i]
    count+=b
    
    return week[count%7]
