package leetCode;

public class Same_Tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
       boolean isSame=true;
       if(p==q)
    	   return true;
       if(p!=null&&q!=null)
       {
    	   if(p.val==q.val)
    		   isSame=isSame&&isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
    	   else {
			isSame=false;
		}
       }
       else {
		isSame=false;
	}
       return isSame;
    }
}
