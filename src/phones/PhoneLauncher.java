package phones;

public class PhoneLauncher {

	public static void main(String[] args) {
		PhoneLauncher launch = new PhoneLauncher();
		launch.launch();
	}
	
	private void launch() {
		SmartPhone iPhone = new SmartPhone("Apple");
		iPhone.browseWeb("google.com");
		iPhone.findPosition();
		iPhone.playGame("snake");
		iPhone.ringAlarm("wake up");
		iPhone.call("1111111");
		iPhone.call("222222");
		iPhone.call("33333");
		iPhone.call("44444");
		iPhone.call("55555");
		iPhone.call("666666");
		iPhone.call("777777");
		iPhone.call("88888");
		iPhone.call("99999");
		iPhone.call("1010101010");
		iPhone.call("111111111111");
		iPhone.call("1212121212");
		iPhone.call("1313131313");
		iPhone.call("0013131313");
		iPhone.printLastNumbers();
		System.out.println("Brand: " + iPhone.getBrand());
		
		
		
		MobilePhone nokia = new MobilePhone("Nokia");
		nokia.call("07787344525");
		nokia.printLastNumbers();
		System.out.println("Brand: " + nokia.getBrand());

		
		OldPhone housePhone = new OldPhone("BT");
		housePhone.call("01609 772969");
		System.out.println("Brand: " + housePhone.getBrand());

	}

}
