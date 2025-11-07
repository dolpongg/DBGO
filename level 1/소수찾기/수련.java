class Solution {
    public int solution(int n) {
        int answer = 0;

        boolean[] prime = new boolean[1000001];
        //1. 소수배열 만들기
        for(int i = 2; i <= 1000000; i++){
            for(int j = i+i; j <= 1000000; j+=i){
                prime[j] = true;
            }
        }
        //2. 소수 카운트
        for(int i = 1; i <= n; i++){
            if(!prime[i]) answer++;
        }


        return answer-1;
    }
}