//Unfinished 

public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
            }
        if(p != null || q != null){
            return false;
        }
        
        return (p == q) && isSameTree(p.left,q.left) && ; 
    }