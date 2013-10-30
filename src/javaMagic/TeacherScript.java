package javaMagic;

public class TeacherScript {

	
	public static void main(String[] args) {
		TeacherScript launcher = new TeacherScript();
		launcher.launch();

	}
	
	private void launch() {
		Lecturer lecturerOne = new Lecturer("Adam");
		lecturerOne.doResearch("Computer Science");
		lecturerOne.teach("Java");
		System.out.println("Lecturer name: " + lecturerOne.getName());
		
	}

}
