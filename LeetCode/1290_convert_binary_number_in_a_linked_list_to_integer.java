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
    public int getDecimalValue(ListNode head) {
        int c = 0;
        ListNode ptr = head;
        while(ptr != null) {
            c++;
            ptr = ptr.next;
        }
        c--;
        int num = 0;
        ptr = head;
        while(ptr!=null) {
            num += ptr.val * Math.pow(2,c);
            c--;
            ptr = ptr.next;
        }
        return num;
    }
}