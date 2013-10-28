package week_five;

public class TreeIntSortedList implements IntSortedList {
	
	private int value;
	private TreeIntSortedList left;
	private TreeIntSortedList right;
	
	public TreeIntSortedList(int x) {
		this.value = x;
		this.left = null;
		this.right = null;
	}

	@Override
	public void add(int x) {
		TreeIntSortedList temp = this;
		if (x > this.value) {
			if (right == null) {
				right = new TreeIntSortedList(x);
		
			} else { 
				right.add(x);
			}
		} else {
			if (left == null) {
				left = new TreeIntSortedList(x);
			} else { 
				left.add(x);
			}
		
		}
		
	}

	@Override
	public boolean contains(int x) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String toString() {
		String result = "";
		
		
		
		return result;
	}

}
