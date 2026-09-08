class Solution {
    public int countCommas(int n) {
        int count = 0;
        if(n==1000){
            return 1;
        }
        if(n>1000){
            for(int i = 999; i<=n; i++){
                count++;
            }
        }else{
            return 0;
        }
        return count-1;
    }
}