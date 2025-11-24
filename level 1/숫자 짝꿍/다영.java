import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int[][] cnt = new int[2][10];
        
        for (char x : X.toCharArray()) {
            cnt[0][x - '0']++;
        }
        for (char y : Y.toCharArray()) {
            cnt[1][y - '0']++;
        }
        for (int i=9; i>=0; i--) {
            int add = Math.min(cnt[0][i], cnt[1][i]);
            
            if (add > 0) {
                for (int j=0; j<add; j++) {
                    sb.append(i);
                }
            }
        }
        if (sb.length() == 0) {
            return "-1";
        }
        if (sb.charAt(0) == '0') {
            return ("0");
        }
        answer = sb.toString();
        return answer;
    }
}
