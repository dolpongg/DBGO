import java.util.*;

class Solution {
    
    public boolean canPut(int[] wallet, int[] bill) {
        Arrays.sort(wallet);
        Arrays.sort(bill);
        
        if (bill[0] > wallet[0] || bill[1] > wallet[1]) {
            return false;
        }
        return true;
    }
    
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        while (true) {
            if (canPut(wallet, bill)) {
                break;
            }
            Arrays.sort(bill);
            bill[1] /= 2;
            answer++;
        }
        return answer;
    }
}
