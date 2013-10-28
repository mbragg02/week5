package week_five;

public class IntSetScript {


	public static void main(String[] args) {
		IntSetScript script = new IntSetScript();
		script.launch();
	}
	
	private void launch() {
		System.out.println("List Set /////////////");

		IntSet listSet = new ListIntSet(10);
		listSet.add(4);
		listSet.add(5);
		listSet.add(53);
		listSet.add(23);
		listSet.add(76);
		listSet.add(76);
		System.out.println(listSet.containsVerbose(5));
		System.out.println(listSet.toString());
		
		System.out.println("Tree Set /////////////");
		IntSet treeSet = new TreeIntSet(10);
		treeSet.add(6);
		treeSet.add(3);
		treeSet.add(2);
		treeSet.add(1);
		treeSet.add(8);
		treeSet.add(11);
		treeSet.add(46);
		treeSet.add(35);
		treeSet.add(22);
		treeSet.add(4);
		System.out.println(treeSet.containsVerbose(8));
		System.out.println(treeSet.toString());
	}

}
