package club99_0520_0628;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day32 {

//    int[] nums = {3,2,1,4};
//    int[] nums = {1, 2};
    int[] nums = {2, 1, 3};
    int result = 0;

    public Day32() {
        findNonMinOrMax(this.nums);
    }

    public int getResult() {
        return result;
    }

    public int findNonMinOrMax(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max && nums[i] != min) {
                list.add(nums[i]);
            }
        }

        if (list.size() == 0) {
            result = -1;
            return result;
        } else {
            result = list.get(0);
            return result;
        }
    }
}
