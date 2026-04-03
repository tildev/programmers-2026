package programmers.l181932;

public class Solution {
  public String solution(String code) {
    StringBuilder answer = new StringBuilder();
    boolean isModeZero = true;
    for (int i = 0; i < code.length(); i++) {
      char current = code.charAt(i);
      if (current == '1') {
        isModeZero = !isModeZero;
        continue;
      }

      if (isModeZero) {
        if (i % 2 == 0) {
          answer.append(current);
        }
      } else {
        if (i % 2 != 0) {
          answer.append(current);
        }
      }
    }

    String result = answer.toString();
    return result.isEmpty() ? "EMPTY" : result;
  }

  public String solution1(String code) {
    StringBuilder ret = new StringBuilder();
    int mode = 0;
    for (int i = 0; i < code.length(); i++) {
      char current = code.charAt(i);
      if (current == '1') {
        mode = 1 - mode;
        continue;
      }
      if (i % 2 == mode) {
        ret.append(current);
      }
    }

    String answer = ret.toString();
    return answer.isEmpty() ? "EMPTY" : answer;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    String result = solution.solution1("abc1abc1abc");
    System.out.println(result);
  }
}
