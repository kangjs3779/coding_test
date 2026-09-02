class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length];
        
        for(int i = 1; i <= length; i++) {
            answer[i - 1] = num_list[length - i];
        }
        
        return answer;
    }
}