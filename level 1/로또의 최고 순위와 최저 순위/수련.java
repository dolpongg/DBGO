import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCnt = 0;
        int matchCnt = 0;

        Set<Integer> winSet = new HashSet<>();
        for (int num : win_nums) {
            winSet.add(num);
        }

        // 내 로또 번호 검사
        for (int num : lottos) {
            if (num == 0) {
                zeroCnt++;
            } else if (winSet.contains(num)) {
                matchCnt++;
            }
        }

        int maxMatch = matchCnt + zeroCnt;
        int minMatch = matchCnt;

        int bestRank = getRank(maxMatch);
        int worstRank = getRank(minMatch);

        return new int[] {bestRank, worstRank};
    }

    private int getRank(int match) {
        if (match <= 1) {
            return 6;
        }
        return 7 - match;
    }
}
