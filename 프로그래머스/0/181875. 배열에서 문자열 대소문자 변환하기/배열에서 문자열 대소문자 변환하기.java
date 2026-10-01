class Solution {
    public String[] solution(String[] strArr) {
        
        for(int i = 1; i <= strArr.length; i++) {
            strArr[i-1] = (i % 2) == 0 ? strArr[i-1].toUpperCase() : strArr[i-1].toLowerCase();
        }
        
        return strArr;
    }
}