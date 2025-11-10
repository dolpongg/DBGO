import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        int minW = Math.min(wallet[0], wallet[1]);
        int maxW = Math.max(wallet[0], wallet[1]);

        int b0 = bill[0];
        int b1 = bill[1];

        while (Math.min(b0, b1) > minW || Math.max(b0, b1) > maxW) {
            if (b0 > b1) {
                b0 = b0 / 2;
            } else {
                b1 = b1 / 2;
            }
            answer++;
        }

        return answer;
    }
}
