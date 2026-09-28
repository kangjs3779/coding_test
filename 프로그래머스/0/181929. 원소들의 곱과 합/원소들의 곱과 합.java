class Solution {
    public int solution(int[] num_list) {
        int multiple = 1;
        int square = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            multiple *= num_list[i];
            square += num_list[i];
        }
        
        int answer = multiple < (square * square) ? 1 : 0;
        
        return answer;
    }
}