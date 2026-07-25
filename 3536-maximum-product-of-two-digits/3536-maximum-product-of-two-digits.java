class Solution {
    public int maxProduct(int n) {
String str = Integer.toString(n);   
int[] arr = new int[str.length()];

for (int i = 0; i < str.length(); i++) {
    arr[i] = str.charAt(i) - '0';
}
Arrays.sort(arr);
int mul = 1;
for(int i = str.length()-1; i>=str.length()-2; i--){
mul *= arr[i];
}
return mul;
    }
}