package club99_0520_0628;

public class Day27 {

    int[] nums = {1,2,3,1,1,3};
    int result = 0;

    public Day27() {
        numIdenticalPairs(this.nums);
    }

    public int getResult() {
        return result;
    }

    public int numIdenticalPairs(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    result ++;
                }
            }
        }
        return result;
    }

}
