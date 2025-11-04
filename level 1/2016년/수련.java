import java.util.*;

class Solution {
    public String solution(int a, int b) {

        String[] weeks = new String[]{"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] months = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
        int days = 0;
        for(int i = 0; i < a; i++){
            days += months[i];
        }
        days += b;

        return weeks[days%7];
    }
}