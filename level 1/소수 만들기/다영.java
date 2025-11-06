class Solution {
    boolean[] prime = new boolean[3001];

    public void getPrime() {
        prime[2] = true;
        
        for (int i=2; i<=3000; i++) {
            for (int j=i+i; j<=3000; j+=i) {
                prime[j] = true;
            }
        }
    }
    
    public int solution(int[] nums) {
        int answer = 0;
        
        getPrime();
        for (int i=0; i<nums.length-2; i++) {
            for (int j=i+1; j<nums.length-1; j++) {
                for (int k=j+1; k<nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k];

                    if (!prime[num]) {
                        answer += 1;
                    }
                }
            }
        }
        
        return answer;
    }
}
