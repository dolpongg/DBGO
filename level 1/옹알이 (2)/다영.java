import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] baby = {"aya", "ye", "woo", "ma"};
        
        for (String bab : babbling) {
            boolean flag = true;
            
            for (String b : baby) {
                if (bab.contains(b+b)) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                continue;
            }
            for (String b : baby) {
                if (bab.contains(b)) {
                    bab = bab.replace(b, " ");
                }
            }
            if (bab.trim().isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}
