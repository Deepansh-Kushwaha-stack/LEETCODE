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
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        temp = head;
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = temp.val;
            temp = temp.next;
        }
        int i=0; 
        int j = arr.length-1;
        while(i <= j){
            if(arr[i] != arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}