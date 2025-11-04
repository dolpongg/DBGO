import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int maxCnt = 0;
        int[] answer = {};
        int[] cnt = {0, 0, 0, 0};
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        ArrayList<Integer> ans = new ArrayList<>();;
        
        for (int i=0; i<answers.length; i++) {
            if (one[i%5] == answers[i]) {
                cnt[1]++;
                if (maxCnt < cnt[1]) {
                    maxCnt = cnt[1];
                }
            }
            if (two[i%8] == answers[i]) {
                cnt[2]++;
                if (maxCnt < cnt[2]) {
                    maxCnt = cnt[2];
                }
            }
            if (three[i%10] == answers[i]) {
                cnt[3]++;
                if (maxCnt < cnt[3]) {
                    maxCnt = cnt[3];
                }
            }
        }
        for (int i=1; i<=3; i++) {
            if (maxCnt == cnt[i]) {
                ans.add(i);
            }
        }
        answer = new int[ans.size()];
        for (int i=0; i<ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}
