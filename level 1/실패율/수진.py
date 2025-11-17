def solution(N, stages):
    answer = []
    result=[]
    stages.sort()
    sum=0
    for i in range(1,N+1):
        if stages.count(i)==0:
            sol=0
            answer.append((i,0))
        else:
            sol=stages.count(i)/(len(stages)-sum)
            sum+=stages.count(i)
            answer.append((i,sol))
        
        
    answer.sort(key = lambda x: -x[1])
    
    for i in range(N):
        result.append(answer[i][0])
           
            
        
        
    return result
