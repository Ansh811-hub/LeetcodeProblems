class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int twenty = 0;
        for(int i = 0; i<bills.length; i++){
            if(bills[i] == 5){
                five++;
                continue;
            }else if(bills[i] == 10){
                ten++;
                if(five != 0){
                    five--;
                    continue;
                }else{
                    return false;
                }
            }else if(bills[i] == 20){
                twenty++;
                if(ten != 0 && five != 0){
                    ten--;
                    five--;
                    continue;
                }else if (five >= 3){
                    five--;
                    five--;
                    five--;
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
