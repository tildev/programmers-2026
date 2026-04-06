package programmers.l181925;

public class Solution {
  public String solution(int[] numLog) {
    StringBuilder answer = new StringBuilder();

    for(int i = 1; i < numLog.length; i++){
        answer.append(switch (numLog[i] - numLog[i-1]){
            case 1 -> "w";
            case -1 -> "s";
            case 10 -> "d";
            case -10 -> "a";
            default -> throw new IllegalStateException("Unexpected value");
        });
    }
    return answer.toString();
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] numLog = new int[] {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
    System.out.println(solution.solution(numLog));
  }
}
