package programmers.l181930;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

class Solution {
  public int solution(int a, int b, int c) {
    int answer = 1;
    Set<Integer> set = new HashSet<>();
    set.add(a);
    set.add(b);
    set.add(c);

    answer *= (a + b + c);

    if (set.size() <= 2) {
      answer *= (a * a + b * b + c * c);
    }
    if (set.size() == 1) {
      answer *= (a * a * a + b * b * b + c * c * c);
    }
    return answer;
  }

  public int solution1(int a, int b, int c) {
    long count = IntStream.of(a, b, c).distinct().count();

    int repeat = count == 3 ? 1 : count == 2 ? 2 : 3;

    return IntStream.rangeClosed(1, repeat)
        .map(i -> (int) (Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i)))
        .reduce(1, (x, y) -> x * y);
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int result = solution.solution(4, 4, 4);
    System.out.println(result);
  }
}
