package programmers.l181931;

import java.util.stream.IntStream;

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

  public int solution1(int a, int d, boolean[] included) {
    return IntStream.range(0, included.length)
            .filter(i -> included[i])
            .map(i -> a + (i * d))
            .sum();
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    boolean[] included = new boolean[] {true, false, false, true, true};
    int result = solution.solution(3, 4, included);
    System.out.println(result);
  }
}
