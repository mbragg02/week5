package week_five;

public class IntegerTreeNode {
	
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;
	
	public IntegerTreeNode(int newNumber) {
		left = null;
		right = null;
		value = newNumber;
	}
	
	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
		
			} else { 
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else { 
				left.add(newNumber);
			}
		
		}
	} // end void add

	
	
	
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
	} // end boolean contains
		
	
	public int getMax() {

		int max = value;
		IntegerTreeNode tempNode = right;

		while(tempNode != null) {
			max = tempNode.value;
			tempNode = tempNode.right;
		}
		return max;
	}
	
	
	
	
	
	public int getMin() {
		
		int min = value;
		IntegerTreeNode tempNode = left;

		while(tempNode != null) {
			min = tempNode.value;
			tempNode = tempNode.left;
		}
		return min;
		
	}
	
	public int depth() {
		IntegerTreeNode tempNodeLeft = left;
		IntegerTreeNode tempNodeRight = right;
		int depthCounterLeft = 0;
		int depthCounterRight = 0;
		
		while(tempNodeLeft != null) {
			tempNodeLeft = tempNodeLeft.left;
			depthCounterLeft++;
		}
		
		while(tempNodeRight != null) {
			tempNodeRight = tempNodeRight.right;
			depthCounterRight++;
		}
		
		
		if(depthCounterLeft > depthCounterRight) {
			return depthCounterLeft;
		} else {
			return depthCounterRight;
		}
		
		
	}
		

	
	
		 
		

}
