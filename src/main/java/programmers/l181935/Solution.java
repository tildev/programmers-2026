package programmers.l181935;

public class Solution {
  public int solution(int n) {
    int answer = 0;
    if (n % 2 == 0) {
      for (int i = 2; i <= n; i += 2) {
        answer += (i * i);
      }
    } else {
      for (int i = 1; i <= n; i += 2) {
        answer += i;
      }
    }
    return answer;
  }

  public int solution1(int n) {
    if (n % 2 == 0) {
      int m = n / 2;
      return 4 * m * (m + 1) * (2 * m + 1) / 6;
    } else {
      int k = (n + 1) / 2;
      return k * k;
    }
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.solution(10));
  }
}
