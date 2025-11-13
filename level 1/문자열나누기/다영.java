class Solution {
    public int solution(String s) {
        int answer = 0;
        int same = 0;
        int diff = 0;
        String check = "";
        
        for (String str : s.split("")) {
            if ("".equals(check)) {
                check = str;
                same = 1;
            }
            else if (check.equals(str)) {
                same++;
            }
            else if (!check.equals(str)) {
                diff++;
            }
            if (same == diff) {
                answer++;
                check = "";
                same = 0;
                diff = 0;
            }
        }
        if (same != diff) {
            answer++;
        }
        return answer;
    }
}
