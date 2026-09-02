import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        double length = (double) numbers.length;
        double sum = (double) Arrays.stream(numbers).sum();
        
        double answer = sum / length;
        return answer;
    }
}