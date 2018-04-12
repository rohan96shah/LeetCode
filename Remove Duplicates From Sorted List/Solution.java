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
    public ListNode deleteDuplicates(ListNode head) 
    {
        if(head == null)
        {
            return head;
        }
        
        ListNode node = head;
        while(node.next != null)
        {
            if(node.val == node.next.val)
            {
                //deleting the duplicate node
                node.next = node.next.next;
            }
            else
            {
                //iterating to the next node
                node = node.next;
            }
        }
        return head;
    }
}
