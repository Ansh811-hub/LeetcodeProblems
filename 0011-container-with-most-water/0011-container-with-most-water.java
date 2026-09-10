class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int area=0;
        int ans=0;
        int w=height.length-1;
        while(l<r){

            area= Math.min(height[l],height[r])* w;
            ans=Math.max(area,ans);
            if(height[l]<=height[r]){
                l++;
            }
            else{
                r--;
            }
            w--;
        }
        return ans;
    }
}