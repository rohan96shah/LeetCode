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
    boolean flag = true;
    ListNode temp;
    
    public ListNode swapPairs(ListNode head) 
    {
        if(head == null) 
        {
            return head;
        }
        head = reverse(head);        
        return head;
    }
    
    
    public ListNode reverse(ListNode node)
    {
        if(node.next == null)
        {
            return node;
        }
        
        if(flag)
        {
            temp = node;
            node = node.next;
            temp.next = node.next;
            node.next = temp;
            
            
            flag = false;
            
            node.next = reverse(node.next);
            
            return node;
        }
        else
        {
            flag = true;
            node.next = reverse(node.next);
            return node;
        }
    }
}
