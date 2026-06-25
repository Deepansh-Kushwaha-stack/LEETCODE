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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp = head;
        ListNode odd = new ListNode(100);
        ListNode t1 = odd;
        ListNode even = new ListNode(101);
        ListNode t2 = even;

        int index = 1;

        while(temp != null){
            if(index % 2 == 0){
                ListNode a = new ListNode(temp.val);
                t2.next = a;
                t2 = a;;
            }
            else {
                ListNode a = new ListNode(temp.val);
                t1.next = a;
                t1 = a;

            }
            temp = temp.next;
            index++;
        }
        odd = odd.next;
        even = even.next;

        t1.next = even;

        return odd;
    }
}