def solution(answers):
    answer = []
    s1=[1,2,3,4,5]
    s2=[2,1,2,3,2,4,2,5]
    s3=[3,3,1,1,2,2,4,4,5,5]
    
    ans1=0
    ans2=0
    ans3=0
    
    for i in range(len(answers)):
        if answers[i]==s1[i%5]:
            ans1+=1
        if answers[i]==s2[i%8]:
            ans2+=1
        if answers[i]==s3[i%10]:
            ans3+=1
            

    maxnum=max(ans1,ans2,ans3) #가장 높은점수의 값
      
    if maxnum==ans1:
        answer.append(1)
    if maxnum==ans2:
        answer.append(2)
    if maxnum==ans3:
        answer.append(3)
        
    return answer
