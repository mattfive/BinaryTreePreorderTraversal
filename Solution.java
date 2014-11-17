import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
    	
    	// Cannot instantiate directly since List is an interface
    	List<Integer> sol = new ArrayList<Integer>();
    	
    	if (root==null) return sol;
    	
    	Stack<TreeNode> cur_st = new Stack<TreeNode>();
    	cur_st.push(root);
    	
    	while(!cur_st.isEmpty()) {
	    		
    		TreeNode tn = cur_st.pop();
    		sol.add(tn.val);
    		
    		if (tn.right != null) {
    			cur_st.push(tn.right);
    		}	
    		if (tn.left != null) { 
    			cur_st.push(tn.left);
    		}
    	}
	    	
    	return sol;
    }
}