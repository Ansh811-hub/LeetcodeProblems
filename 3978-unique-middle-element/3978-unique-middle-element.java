class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int p = nums.length/2;
        boolean flag = false;
   for(int i = 0; i<nums.length; i++){
       if(i != p && nums[i] == nums[p]){
           flag = true;
           break;
       }
   }
        return !flag;
}
}