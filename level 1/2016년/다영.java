class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int dayCnt = b;
        int[] monthDate = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfWeek = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        
        for (int i=0; i<a-1; i++) {
            dayCnt += monthDate[i];
        }
        answer = dayOfWeek[dayCnt % 7];
        return answer;
    }
}
