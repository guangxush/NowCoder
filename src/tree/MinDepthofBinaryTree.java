package tree;
/**
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 */
public class MinDepthofBinaryTree {
    public int run(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null){
            return 1+run(root.right);
        }else if(root.right==null){
            return 1+run(root.left);
        }else{
            return 1+Math.min(run(root.right),run(root.left));
        }
    }
}
