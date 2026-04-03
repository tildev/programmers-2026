package programmers.l181928;

class Solution {
  public int solution(int[] num_list) {
    StringBuilder odd = new StringBuilder();
    StringBuilder even = new StringBuilder();

    for (int num : num_list) {
      (num % 2 == 0 ? even : odd).append(num);
    }
    return Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] numList = new int[] {3, 4, 5, 2, 1};
    int result = solution.solution(numList);
    System.out.println(result);
  }
}
