import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] stageCount = new int[N + 2];

        for (int s : stages) {
            stageCount[s]++;
        }

        int total = stages.length;
        List<StageFail> failList = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            int stuck = stageCount[i];
            double failRate = (total == 0) ? 0 : (double) stuck / total;

            failList.add(new StageFail(i, failRate));
            total -= stuck;
        }

        Collections.sort(failList);

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = failList.get(i).stage;
        }
        return answer;
    }

    static class StageFail implements Comparable<StageFail> {
        int stage;
        double failRate;

        public StageFail(int stage, double failRate) {
            this.stage = stage;
            this.failRate = failRate;
        }

        @Override
        public int compareTo(StageFail o) {
            if (this.failRate < o.failRate) return 1;
            if (this.failRate > o.failRate) return -1;
            // 실패율 같으면 스테이지 번호 오름차순
            return this.stage - o.stage;
        }
    }
}