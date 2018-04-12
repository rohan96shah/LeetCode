/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution 
{
    public void deleteNode(ListNode node) 
    {
        if(node.next == null)
        {
            return;
        }
        
        //Over writing the node given
        node.val = node.next.val;
        node.next = node.next.next;  
    }
}