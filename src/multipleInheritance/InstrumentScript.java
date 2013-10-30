package multipleInheritance;

public class InstrumentScript {

	
	public static void main(String[] args) {
		InstrumentScript launcher = new InstrumentScript();
		launcher.launch();
	}
	
	private void launch() {
		Guitar acoustic = new Guitar();
		acoustic.tune();
		acoustic.play();
		acoustic.burn();
		
	}

}
