class symTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; 
    }
    public static boolean isSymmetric(TreeNode root){
        if(root.right == null && root.left == null){
            return true;
        }
    }

    public static void main(String agrs[]){

    }
}