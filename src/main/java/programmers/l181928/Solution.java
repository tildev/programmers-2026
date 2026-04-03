package programmers.l181928;

class Solution {
  public int solution(int[] num_list) {
    int odd = 0;
    int even = 0;
    for (int num : num_list) {
      if (num % 2 == 0) {
        even = even * 10 + num;
      } else {
        odd = odd * 10 + num;
      }
    }
    return even + odd;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] numList = new int[] {3, 4, 5, 2, 1};
    int result = solution.solution(numList);
    System.out.println(result);
  }
}
