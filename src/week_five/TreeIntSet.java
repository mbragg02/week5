package week_five;

public class TreeIntSet implements IntSet {
	
	private int value;
	private TreeIntSet left;
	private TreeIntSet right;
	
	public TreeIntSet(int x) {
		this.left = null;
		this.right = null;
		this.value = x;
	}
	

	@Override
	public void add(int newNumber) {
		if (contains(newNumber) == false){
			if (newNumber > this.value) {
				if (right == null) {
					right = new TreeIntSet(newNumber);
			
				} else { 
					right.add(newNumber);
				}
			} else {
				if (left == null) {
					left = new TreeIntSet(newNumber);
				} else { 
					left.add(newNumber);
				}
			
			}
		}

	}

	@Override
	public boolean contains(int n) {
		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
		        return false;
		    } else {
		    	return right.contains(n); 
		    }
		} else {
			if (left == null) {
				return false;
		    } else {
		    	return left.contains(n); 
		    }
		}
	}

	@Override
	public boolean containsVerbose(int n) {
		System.out.println(this.value);

		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
		        return false;
		    } else {
		    	return right.containsVerbose(n); 
		    }
		} else {
			if (left == null) {
				return false;
		    } else {
		    	return left.containsVerbose(n); 
		    }
		}
	}
	
	private int depth(TreeIntSet node) {
	    if (node == null) {
	        return 0;
	    } else {
	        int leftDepth = depth(node.left);
	        int rightDepth = depth(node.right);
	        
	        if (leftDepth > rightDepth)
	            return (leftDepth + 1);
	        else
	            return (rightDepth + 1);
	    }
	}
	
	
	private String printAll() {
		TreeIntSet root = this;
		String result = "";
		int depth = depth(root);
	    for (int i = 1; i <= depth; i++) {
	        result += printLevel(root, i);
	    }
	    return result;
	}
	
	private String printLevel(TreeIntSet t, int level) {
	    if (t == null) {
	        return "";
	    }
	    if (level == 1) {
	        return t.value + ", ";
	    } else if (level > 1) {
	        String leftString = printLevel(t.left, level - 1);
	        String rightString = printLevel(t.right, level - 1);
	        return leftString + rightString;
	    }
	    else 	    
	    	return "";
		
	}
	
	
	
	public String toString() {
		return printAll();
	}

}
