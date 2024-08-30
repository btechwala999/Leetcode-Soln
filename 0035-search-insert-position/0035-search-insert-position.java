class Solution {
    public int searchInsert(int[] nums, int target) {
        int val = 0;
        for(int i = 0; i< nums.length;i++){
            if(nums[i] == target){
                val = i;
                break;
            }if(i <= nums.length-2){
                if(nums[i+1] > target && nums[i] < target){
                    val = i+1;
                }
            }
            else if(i == nums.length-1){
                if(nums[i] < target){
                    val = i + 1;
                }
            }

        }
        return val;
    }
}