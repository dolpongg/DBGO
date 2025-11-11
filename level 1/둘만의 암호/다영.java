class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for (char a : s.toCharArray()) {
            String change = "";
            int idx = 1;
            
            for (int i=1; i<=index; i++) {
                char checkScip =  (char)('a' + (a - 'a' + idx) % 26);
                change = String.valueOf(checkScip);
                
                if (skip.contains(change)) {
                    i--;
                }
                idx++;
            }
            answer += change;
        }
        return answer;
    }
}
