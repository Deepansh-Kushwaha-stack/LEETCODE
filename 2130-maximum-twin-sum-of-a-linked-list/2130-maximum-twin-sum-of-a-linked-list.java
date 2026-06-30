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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverseList(slow.next);
        ListNode p1 = head;
        ListNode p2 = slow.next;
        int max = 0;
        while(p2 != null){
            int sum = 0;
            sum+=p1.val+p2.val;
            p1 = p1.next;
            p2=p2.next;
            max = Math.max(sum , max);
        }
        return max;
    }
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode forv = null;

        while(curr != null){
            forv = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forv; 
        }

        return prev;
    }
}