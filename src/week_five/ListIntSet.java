package week_five;


public class ListIntSet implements IntSet {
	private int value;
	private ListIntSet next;
	
	public ListIntSet(int x) {
		this.value = x;
		this.next = null;
	}
	
	

	@Override
	public void add(int x) {
		if(contains(x) == false) {
			if (next == null) {
				next = new ListIntSet(x);
		
			} else { 
				next.add(x);
			}
		}
		
	}

	@Override
	public boolean contains(int x) {
		if (x == this.value) {
			return true;
		} 
		else {
			if (next == null) {
				return false;
		    } else {
		    	return next.contains(x); 
		    }
		}
	}

	@Override
	public boolean containsVerbose(int x) {
    	System.out.println(this.value);

		if (x == this.value) {
			return true;
		} 
		else {
			if (next == null) {
				return false;
		    } else {
		    	return next.containsVerbose(x); 
		    }
		}
	}
	
	public String toString() {
		String result = "";
		ListIntSet temp = this;
		
		while (temp != null) {
			result += temp.value;
			if(temp.next != null) {
				result += ", ";
			}
			temp = temp.next;
		}
		return result;
	}

}
