import java.util.Arrays;

class Solution {
    public int solution(int n) {
        String number = n + "";
        String[] arr = number.split("");
        int answer = 0;
        
        for(int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            answer += num;
        }
        
        
        
        
        return answer;
    }
}