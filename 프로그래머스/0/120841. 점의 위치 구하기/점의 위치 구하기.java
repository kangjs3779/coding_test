class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        boolean result = dot[0] * dot[1] > 0;
        
        if(result) {
            answer = dot[0] > 0 ? 1 : 3;
        } else {
            answer = dot[0] > 0 ? 4 : 2;
        }
        
        return answer;
    }
}