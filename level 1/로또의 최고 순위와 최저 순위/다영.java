class Solution {
    public int getRank(int cnt) {
        switch(cnt) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
    
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        boolean[] win = new boolean[46];
        int cntZero = 0;
        int cntWin = 0;
        
        for (int num : win_nums) {
            win[num] = true;
        }
        for (int lotto : lottos) {
            if (win[lotto]) {
                cntWin++;
            }
            if (lotto == 0) {
                cntZero++;
            }
        }
        answer[1] = getRank(cntWin);
        answer[0] = getRank(cntWin + cntZero);
        return answer;
    }
}
