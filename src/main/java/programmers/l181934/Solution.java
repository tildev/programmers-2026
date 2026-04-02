package programmers.l181934;

public class Solution {
  public int solution(String ineq, String eq, int n, int m) {
    String condition = ineq + eq;

    boolean result =
        switch (condition) {
          case ">=" -> n >= m;
          case "<=" -> n <= m;
          case ">!" -> n > m;
          case "<!" -> n < m;
          default -> throw new IllegalStateException("Unexpected value: " + condition);
        };

    return result ? 1 : 0;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    String ineq = "<";
    String eq = "=";
    int n = 20;
    int m = 50;
    solution.solution(ineq, eq, n, m);
  }
}
