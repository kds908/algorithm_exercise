package codes.day01;

/**
 * @author Abner.S
 * @description
 * @date 2020/1/4 23:32
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        // 需要考虑 k 的值大于 length 的情况，所以取模处理
        k %= nums.length;
        this.reverse(nums, 0, nums.length - 1);
        this.reverse(nums, 0, k - 1);
        this.reverse(nums, k, nums.length - 1);
    }

    /**
     * 反转数组
     * @param nums 待反转数组
     * @param start 反转开始下标
     * @param end 反转结束下标
     */
    public void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int tempNum = nums[start];
            nums[start] = nums[end];
            nums[end] = tempNum;
            start++;
            end--;
        }
    }

}
