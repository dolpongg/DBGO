import java.util.*;

class Solution {
    static boolean[] prime = new boolean[9001];
    static int answer = -1;
    static int[] output = new int[3];
    public int solution(int[] nums) {
        //1. 소수 만들기
        for(int i = 2; i <= 9000; i++){
            for(int j = i+i; j <= 9000; j+=i){
                prime[j] = true;
            }
        }

        // 2.조합
        combination(nums,0,0,3);
        return answer+1;
    }

    static void combination(int[] nums, int start, int depth, int r) {
        if(depth == r) {
            int sum = 0;
            for(int i = 0; i < 3; i++){
                sum += output[i];
            }
            if(!prime[sum]) answer++;
            return;
        }

        for(int i = start; i < nums.length; i++) {
            output[depth] = nums[i];
            combination(nums, i + 1, depth + 1, r);
        }
    }
}