class Solution {
    public boolean numberhasevendigits(int num){
        int digitscount = 0;
        while(num != 0){
            num = num / 10;
            digitscount++;
        }
        return digitscount % 2 == 0;
    }
    public int findNumbers(int[] nums) {
      int evencount = 0;
        for(int i=0; i<nums.length; i++){
            if(numberhasevendigits(nums[i])){
                evencount++;
            }
        }
      return evencount;  
    }
}