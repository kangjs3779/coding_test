class Solution {
    public int solution(int n) {
        int even = (n % 2) == 0 ? n : n-1;
        int answer = 0;
        
        for(int i = 2; i <= even; i += 2) {
            answer += i;
        }
        return answer;
    }
}