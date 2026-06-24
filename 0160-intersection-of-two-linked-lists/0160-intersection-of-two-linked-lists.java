/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1= 0, len2=0;
        ListNode tmp1 = headA;
        ListNode tmp2 = headB;

        while(tmp1 != null){
            len1++;
            tmp1=tmp1.next;
        }
        while(tmp2 != null){
            len2++;
            tmp2=tmp2.next;
        }

        tmp1 = headA;
        tmp2 = headB;

        if(len1 > len2){
            for(int i=1;i<=len1-len2; i++){
                tmp1=tmp1.next;
            }
        }

        if(len2> len1){
            for(int i=1;i<=len2-len1; i++){
                tmp2=tmp2.next;
            }
        }

        while(tmp1 != tmp2){
            tmp1=tmp1.next;
            tmp2=tmp2.next;
        }
        return tmp1;
    }
}