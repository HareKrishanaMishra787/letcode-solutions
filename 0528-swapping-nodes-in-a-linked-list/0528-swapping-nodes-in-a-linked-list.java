class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        //Swapping the values
        ListNode cur = head;
        //get to the kth node
        while(k>1) {
            cur = cur.next;
            k--;
        }
        ListNode val1 = cur;
        ListNode sec = head;
        //get to the kth node from the last
        while(cur.next !=null) {
            sec = sec.next;
            cur = cur.next;
        }
        //swap values
        int temp = val1.val;
        val1.val = sec.val;
        sec.val = temp;
        return head;
    }
}