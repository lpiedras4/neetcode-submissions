/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List <Integer> res = new ArrayList <>();
        Queue <TreeNode> queue = new LinkedList <>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode rightSide = null;
            int qLen = queue.size();
            for(int i = 0; i<qLen;i++){
                TreeNode currNode = queue.poll();
                if(currNode!=null){
                    rightSide = currNode;
                    queue.offer(currNode.left);
                    queue.offer(currNode.right);
                }
            }
            if(rightSide!=null){
                res.add(rightSide.val);
            }
            }
        return res;
        }
    }

