class Solution {
    public int search(int[] nums, int target) {
        
        int upper = nums.length -1;
        int lower = 0;
        while(lower <= upper) {
            int middle = lower + (upper - lower) / 2;
            if(nums[middle] == target) {
                return middle;
            } else if(nums[middle] > target) {
                upper = middle -1;
            } else {
                lower = middle + 1;
            }
        }
        return -1;
    }
}