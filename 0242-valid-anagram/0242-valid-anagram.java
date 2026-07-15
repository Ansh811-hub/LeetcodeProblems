class Solution {
    public boolean isAnagram(String s, String t) {

        List<Integer> list = new ArrayList<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i<s.length(); i++){
            list.add(s.charAt(i) - 'a');
        }
        for(int i = 0; i<t.length(); i++){
             int value = t.charAt(i)-'a';

            if(list.contains(value)){
                list.remove(Integer.valueOf(value));
            }
        }
        if(list.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}