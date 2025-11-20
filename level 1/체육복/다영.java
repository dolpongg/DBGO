import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        Set<Integer> res = new HashSet<>();
        
        Arrays.sort(lost);
        for (int r : reserve) {
            res.add(r);
        }
        for (int i=0; i<lost.length; i++) {
            if (res.contains(lost[i])) {
                res.remove(lost[i]);
                lost[i] = -1;
            }
        }
        for (int l : lost) {
            int front = l-1;
            int back = l+1;

            if (l == -1) continue;
            if (res.contains(front)) {
                res.remove(front);
                continue;
            }
            if (res.contains(back)) {
                res.remove(back);
                continue;
            }
            answer--;
        }
        return answer;
    }
}
