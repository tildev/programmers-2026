package programmers.l181927;

import java.util.Arrays;

class Solution {
  public int[] solution(int[] num_list) {

    int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
    int lastValue = num_list[num_list.length - 1];
    int beforeValue = num_list[num_list.length - 2];
    answer[answer.length - 1] = lastValue > beforeValue ? lastValue - beforeValue : lastValue * 2;
    return answer;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] numList = new int[] {5, 2, 1, 7, 5};
    int[] result = solution.solution(numList);
    for (int r : result) {
      System.out.println(r);
    }
  }
}
