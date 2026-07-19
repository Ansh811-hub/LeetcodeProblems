class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
 int cnt = 0;
            ListNode temp = head;

            if(temp == null || temp.next == null) {
                return null;
            }

            while(temp != null){
                cnt++;
                temp = temp.next;
            }



            int p =1;
            temp = head;
            while( p < cnt-n){
                temp = temp.next;
                p++;
            }

            if(cnt-n == 0){
                return temp.next;

            }

            temp.next = temp.next.next;
            return head;
        }
}
