import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        int size = 0;
        
        for (int i : ingredient) {
            st.push(i);
            
            size = st.size();
            if (size >= 4) {
                if (  st.get(size - 4) == 1
                   && st.get(size - 3) == 2
                   && st.get(size - 2) == 3
                   && st.get(size - 1) == 1) {
                    answer++;
                    st.pop();
                    st.pop();
                    st.pop();
                    st.pop();
                }
            }
        }
        return answer;
    }
}
