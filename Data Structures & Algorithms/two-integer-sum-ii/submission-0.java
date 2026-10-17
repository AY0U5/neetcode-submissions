class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j){
            int current_sum = numbers[i] + numbers[j];
            if (current_sum == target){
                return new int[]{i + 1, j + 1};
            }
            else if (current_sum < target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[]{-1, -1};
    }
}
