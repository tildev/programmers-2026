package programmers.l181931;

class Solution {
  public int solution(int a, int d, boolean[] included) {
    int answer = 0;

    for (boolean isIncluded : included) {
      if (isIncluded) {
        answer += a;
      }
      a += d;
    }
    return answer;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    boolean[] included = new boolean[] {true, false, false, true, true};
    int result = solution.solution(3, 4, included);
    System.out.println(result);
  }
}
