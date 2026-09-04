class Solution {
    public int solution(int angle) {
        int answer = 0;
        int diff = angle - 90;
        
        if(diff <= 0) {
            answer = diff == 0 ? 2 : 1;
        } else {
            answer = diff == 90 ? 4 : 3;
        }
        
        
        return answer;
    }
}