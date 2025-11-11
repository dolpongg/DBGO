import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        boolean[] isSkip = new boolean[26];
        for (char c : skip.toCharArray()) {
            isSkip[c - 'a'] = true;
        }

        List<Character> allowed = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            if (!isSkip[c - 'a']) allowed.add(c);
        }

        int M = allowed.size();

        int[] pos = new int[26];
        Arrays.fill(pos, -1);
        for (int i = 0; i < M; i++) pos[allowed.get(i) - 'a'] = i;

        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            int start = pos[ch - 'a'];
            int newIdx = (start + index) % M;
            sb.append(allowed.get(newIdx));
        }

        return sb.toString();
    }

}
