package week_five;

public class IntegerTreeScript {
	
	public static void main(String[] args) {
		IntegerTreeNode tree = null;
		IntegerTreeScript script = new IntegerTreeScript();
		script.launch(tree);

	}
	
	public void launch(IntegerTreeNode tree) {
		tree = new IntegerTreeNode(5);
		tree.add(6);
		tree.add(9);
		tree.add(3);
		tree.add(8);
		tree.add(11);
		tree.add(12);


		System.out.println("Max: " + tree.getMax());
		System.out.println("Min: " + tree.getMin());
		System.out.println("Depth: " + tree.depth());
//		System.out.println("String representation: " + tree.toString());
		tree.toString(tree, "");
		
		
	}

}
