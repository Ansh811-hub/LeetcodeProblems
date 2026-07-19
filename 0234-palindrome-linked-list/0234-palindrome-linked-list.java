/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode temp = head;

  StringBuilder sb = new StringBuilder();
    while (temp != null) {
        sb.append(temp.val);
        temp = temp.next;
    }
    String s = "";
    for(int i = sb.length()-1; i>=0; i--){
        s += sb.charAt(i);
    }
  if(!sb.toString().equals(s)){
        return false;
    }
    return true;
    }
}