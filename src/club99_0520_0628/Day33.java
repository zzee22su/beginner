package club99_0520_0628;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day33 {

    int[] nums = {1,2,5,2,3};
    int target = 2;
    List<Integer> resultList = new ArrayList<>();

    public Day33() {
        targetIndices(this.nums, this.target);
    }

    public String getResultList() {
        return resultList.toString();
    }

    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                resultList.add(i);
            }
        }
        return resultList;
    }

}
