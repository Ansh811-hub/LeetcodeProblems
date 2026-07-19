import java.math.BigInteger;

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
    public ListNode doubleIt(ListNode head) {

        if (head == null) {
            return null;
        }

        // Step 1: Convert Linked List to String
        StringBuilder sb = new StringBuilder();
        ListNode temp = head;

        while (temp != null) {
            sb.append(temp.val);
            temp = temp.next;
        }

        // Step 2: Convert String to BigInteger and Double it
        BigInteger num = new BigInteger(sb.toString());
        num = num.multiply(BigInteger.valueOf(2));

        // Step 3: Convert back to String
        String str = num.toString();

        // Step 4: Update existing nodes / create new ones if needed
        temp = head;
        ListNode prev = null;
        int i = 0;

        while (temp != null && i < str.length()) {
            temp.val = str.charAt(i) - '0';
            prev = temp;
            temp = temp.next;
            i++;
        }

        // Step 5: Add extra nodes if answer has more digits
        while (i < str.length()) {
            prev.next = new ListNode(str.charAt(i) - '0');
            prev = prev.next;
            i++;
        }

        return head;
    }
}