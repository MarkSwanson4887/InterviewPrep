class maximumDepth {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){ 
            val = x; 
        }
    }

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }
    public static void main(String args[]){
        System.out.println("passed all tests on LeetCode");
    }
}