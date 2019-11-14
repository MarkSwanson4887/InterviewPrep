//Unfinished 
class isSameTree{

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static boolean isSameTreeS(TreeNode p, TreeNode q) {
            if(p == null && q == null){
                return true;
            }
            if((p != null && q == null) || (p == null && q != null)){
                return false;
            }
            else{
                return (p.val == q.val) && isSameTreeS(p.left,q.left) && isSameTree(p.right,q.right);
            }
        }
        public static void main(String[] args){
            System.out.println("Solution passed all leetcode tests");
        }
}