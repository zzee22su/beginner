package club99_0520_0628;

import java.util.Arrays;

public class Day26 {

    int[] nums = {2, 5, 1, 3, 4, 7};
    int n = 3;
    int[] result = {};

    public Day26() {
        shuffle(this.nums, this.n);
    }

    public String getResult() {
        String str = "";
        str = Arrays.toString(nums);
        return str;
    }

    public int[] shuffle(int[] nums, int n) {
        int numsLength = nums.length-1;
        int[] nums1= new int[n];
        int[] nums2= new int[n];
        int[] result= new int[nums.length];

        for (int i = 0 ; i <= numsLength; i++) {
            if (i < n) {
                nums1[i] = nums[i];
            } else {
                nums2[i-n] = nums[i];
            }
        }

        int j = 0;

        for (int i = 0; i <= numsLength; i++) {
            if (i % 2 == 0) {
                result[i] = nums1[j];
                j++;
            } else {
                j--;
                result[i] = nums2[j];
                j++;
            }
        }
        return result;
    }

}
