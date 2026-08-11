class Solution {
    public int numberOfSteps(int num) {
        int cnt = 0;

        if(num == 0) return 0;
        while(num != 0){
        if(num%2 != 0){
            num--;
            cnt++;
        }
            num = num/2;
            cnt++;
        }
        return cnt-1;
    }
}