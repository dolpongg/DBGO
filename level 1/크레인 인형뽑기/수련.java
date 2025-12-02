import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int n = board.length;
        Stack<Integer> basket = new Stack<>();
        int removed = 0;

        for (int move : moves) {
            int col = move - 1;

            for (int row = 0; row < n; row++) {
                int doll = board[row][col];
                if (doll != 0) {
                    board[row][col] = 0;

                    // 바구니 맨 위와 같은지 체크
                    if (!basket.isEmpty() && basket.peek() == doll) {
                        basket.pop();
                        removed += 2;
                    } else {
                        basket.push(doll);
                    }
                    break;
                }
            }
        }

        return removed;
    }
}
