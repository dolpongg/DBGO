import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length / 2;
        Map<Integer, Integer> pocket = new HashMap<>();
        
        for (int num : nums) {
            if (pocket.containsKey(num)) {
                pocket.put(num, pocket.get(num) + 1);
            }
            else {
                pocket.put(num, 1);
            }
        }
        if (pocket.size() < answer) {
            answer = pocket.size();
        }
        return answer;
    }
}
