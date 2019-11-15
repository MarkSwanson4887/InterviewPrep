class symTree {
    public static void main(String agrs[]){
        //Utilizes a helper function so the tree can be split into two seperate trees
       class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x) { val = x; 
        }
       boolean helper(TreeNode root1, TreeNode root2){
            if(root1 == null && root2 == null){
                return true;
            }
            if((root1 == null && root2 != null) || (root1 != null && root2 == null)){
                return false;
            }
            return (root1.val == root2.val) && helper(root1.left,root2.right) && helper(root1.right,root2.left);
        }
        
        boolean isSymmetric(TreeNode root) {
            return helper(root,root);
        }
        }
    }
}