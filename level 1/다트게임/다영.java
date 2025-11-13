class Solution {
    public int getBonusScore(int score, char c) {
        switch(c) {
            case 'D':
                score = score * score;
                break;
            case 'T':
                score = score * score * score;
                break;
        }
        return score;
    }
    
    public int solution(String dartResult) {
        int answer = 0;
        int index = 0;
        int[] score = {0, 0, 0};
        String bonus = "SDT";
        
        
        for (int i=0; i<dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            if ('0' <= c && c <= '9') {
                if (i > 0 && (dartResult.charAt(i - 1) < '0' || '9' < dartResult.charAt(i - 1))) {
                    index++;
                }
                score[index] = score[index] * 10 + c - '0';
            }
            else if (bonus.contains(String.valueOf(c))) {
                score[index] = getBonusScore(score[index], c);
            }
            else if (c == '*') {
                score[index] *= 2;
                if (index - 1 >= 0) {
                    score[index-1] *= 2;
                }
            }
            else if (c == '#') {
                score[index] *= -1;
            }
        }
        answer = score[0] + score[1] + score[2];
        return answer;
    }
}
