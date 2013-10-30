package noahsArk;

public class NoahsScript {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NoahsScript animal = new NoahsScript();
		animal.launch();

	}
	
	private void launch() {
		/**
		 * bears, beetles, cats, crocodiles, dogs, dolphins, eagles, flies, frogs, lizards, monkeys, pigeons, salmon, sharks, snakes, whales.
		 */
		
		
		Fish salmon = new Fish();
		Fish whales = new Fish();
		Fish sharks = new Fish();
		Fish dolphins = new Fish();
		
		Birds eagles = new Birds();
		Birds pigeons = new Birds();
		
		Reptiles lizards = new Reptiles();
		Reptiles crocodiles = new Reptiles();
		Reptiles snakes = new Reptiles();
		
		Amphibians frogs = new Amphibians();

		Insects beetles = new Insects();
		
		Mammals bears = new Mammals();
		Mammals cats = new Mammals();
		Mammals dogs = new Mammals();
		Mammals monkeys = new Mammals();
		
		salmon.reproduce();
		bears.reproduce();
		frogs.reproduce();
		snakes.reproduce();
		sharks.reproduce();
		dogs.call("dogs");
		
	
		
		eagles.makeSound();
		sharks.makeSound();
	
	}

}
