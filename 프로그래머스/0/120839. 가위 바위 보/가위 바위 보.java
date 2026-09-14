class Solution {
    public String solution(String rsp) {
        // 2 -> 0, 0 -> 5, 5 -> 2
        String[] arr = rsp.split("");
        String answer = "";
        
        for(int i=0; i < arr.length; i++) {
            System.out.println(arr[i] == "2");
            if(arr[i].equals("2")) {
                answer += "0";
            } else if (arr[i].equals("0")) {
                answer += "5";
            } else if (arr[i].equals("5")) {
                answer += "2";
            }
        }
        
        
        return answer;
    }
}