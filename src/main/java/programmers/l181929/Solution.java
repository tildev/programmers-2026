package programmers.l181929;

class Solution {
  public int solution(int[] num_list) {
    int sum = 0;
    int multi = 1;

    for (int num : num_list) {
      sum += num;
      multi *= num;
    }
    sum = (int) Math.pow(sum, 2);

    return multi < sum ? 1 : 0;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] numList = new int[] {3, 4, 5, 2, 1};
    int result = solution.solution(numList);
    System.out.println(result);
  }
}
