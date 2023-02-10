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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack <TreeNode> st = new Stack<>();
        List <Integer> arr=new ArrayList<>();
        if(root == null)  
            return arr;
        TreeNode temp=root;
        while(temp !=null || !st.isEmpty()){
            while(temp!=null){
                st.push(temp);
                temp=temp.left;
            }
            temp=st.pop();
            arr.add(temp.val);
            temp=temp.right;
        }
        return arr;
    }
}
