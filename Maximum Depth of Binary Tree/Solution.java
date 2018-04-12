/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution 
{
    int maxHeight = 0;
    
    public int maxDepth(TreeNode node) 
    {
        if(node == null)    return 0;
        
        func(node, 0);
        
        return maxHeight;
    }
    
    public void func(TreeNode node, int h) {
        if(node == null)
        {
            maxHeight = Math.max(maxHeight, h);
            return;
        }
        
        func(node.left, h+1);
        func(node.right, h+1);
    }
    
    
}
