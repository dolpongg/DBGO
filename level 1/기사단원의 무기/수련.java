class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] primeCount = new int[number+1];

        for(int i = 1; i <= number; i++){
            for(int j = i; j <= number; j+=i){
                primeCount[j]++;
            }
        }
        for(int i = 1; i <= number; i++){
            if(primeCount[i] > limit) answer += power;
            else answer += primeCount[i];
        }
        return answer;
    }
}