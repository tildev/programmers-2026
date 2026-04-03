package programmers.l181933;

public class Solution {
  public int solution(int a, int b, boolean flag) {
    return flag ? a + b : a - b;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int result = solution.solution(-4, 7, true);
    System.out.println(result);
  }
}
