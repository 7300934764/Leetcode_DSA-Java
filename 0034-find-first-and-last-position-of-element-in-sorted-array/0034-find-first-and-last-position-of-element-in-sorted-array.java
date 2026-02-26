class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int left=0;
        int right=nums.length-1;
        while(left<=right && nums[left]!=target){
            left++;
        
        }
        while(left<=right && nums[right]!=target){
            right--;
        }
        if(left<=right){
        ans[0]=left;
        ans[1]=right;
        }
        return ans;
    }
}