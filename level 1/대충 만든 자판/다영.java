import java.util.*;

class Solution {
    int[] alphabet = new int[26];
    
    public void getMinPushCnt(String[] keymap) {
        Arrays.fill(alphabet, 10000);
        
        for(String key : keymap) {
            int cnt = 1;
            
            for (int i=0; i<key.length(); i++) {
                char alpha = key.charAt(i);
                int index = alpha - 'A';
                
                if (cnt < alphabet[index]) {
                    alphabet[index] = cnt;
                }
                cnt++;
            }
        }
    }
    
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        getMinPushCnt(keymap);
        
        for(int i=0; i<targets.length; i++) {
            int cnt = 0;
            
            for (int j=0; j<targets[i].length(); j++) {
                char target = targets[i].charAt(j);
                
                if (alphabet[target - 'A'] == 10000) {
                    cnt = -1;
                    break;
                }
                cnt += alphabet[target - 'A'];
            }
            answer[i] = cnt;
        }
        return answer;
    }
}
