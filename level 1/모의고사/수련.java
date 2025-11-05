import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] A = new int[]{1,2,3,4,5};
        int[] B = new int[]{2,1,2,3,2,4,2,5};
        int[] C = new int[]{3,3,1,1,2,2,4,4,5,5};

        int[] count = new int[3];
        for(int i = 0; i < answers.length; i++){
            if(A[i%5] == answers[i]) count[0]++;
            if(B[i%8] == answers[i]) count[1]++;
            if(C[i%10] == answers[i]) count[2]++;
        }

        int a = count[0];
        int b = count[1];
        int c = count[2];

        if(a == b && b == c) return new int[] {1,2,3};
        else if(a == b){
            if(b < c) return new int[] {3};
            else return new int[] {1,2};
        }else if(b == c){
            if(a < b) return new int[] {2,3};
            else return new int[] {1};
        }else if(a == c){
            if(a < b) return new int[] {2};
            else return new int[] {1,3};
        }else{
            if(a < b){
                if(b < c) return new int[] {3};
                else return new int[] {2};
            }else if(a < c){
                if(c < b) return new int[] {2};
                else return new int[] {3};
            }else return new int[] {1};
        }
    }
}