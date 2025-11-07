class Solution {
    boolean[] prime = new boolean[1000001];
    
    public void getPrime() {
        for (int i=2; i<=1000000; i++) {
            if (prime[i]) continue;
            
            for (int j=i+i; j<=1000000; j+=i) {
                prime[j] = true;
            }
        }
    }
    
    public int solution(int n) {
        int answer = 0;
        
        getPrime();
        for (int i=2; i<=n; i++) {
            if (!prime[i]) {
                answer++;
            }
        }
        return answer;
    }
}
