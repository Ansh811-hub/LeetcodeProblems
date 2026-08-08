class Solution {
    public int mySqrt(int n) {
       if (n==0)return 0;
       int l = 1 , h =n;
       while (l<=h){
        int mid = l + (h - l)/2;
        if(mid == n/mid) return mid;
        else if (mid > n/mid) h = mid-1;
        else l = mid+1;
       } 
       return h;
    }
}