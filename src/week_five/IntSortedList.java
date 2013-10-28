package week_five;

public interface IntSortedList {
	
	/**
	 * Adds a new Integer to the list so that the list remains sorted; a list can contain duplicates unlike a set.
	 * @param x Integer. The value to be added.
	 */
	void add(int x);
	
	/**
	 * Returns true if the number is in the list, false otherwise.
	 * @param x Integer. The value to be checked.
	 * @return boolean
	 */
	boolean contains(int x);
	
	/**
	 * Returns a string with the values of the elements in the list separated by commas.
	 * @return String. The string containing all the elements.
	 */
	String toString(); 

}
