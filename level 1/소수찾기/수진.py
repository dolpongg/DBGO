from itertools import permutations
def solution(numbers):
    answer = 0
    nums=[i for i in numbers]
    permu=[]
    for i in range(1,len(nums)+1):
        permu+=list(permutations(nums, i))
        
    new_nums = [int(("").join(p)) for p in permu]
    
    #중복값제거
    new_nums=set(new_nums)
    print(new_nums)

    for i in new_nums:
        cnt=0
        if i==0 or i==1:
            continue
        for j in range(1,i+1):
            if i%j==0:
                cnt+=1
            if cnt>2:
                break
        if cnt==2:
            answer+=1
    return answer
