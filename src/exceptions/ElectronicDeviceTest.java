package exceptions;

public class ElectronicDeviceTest {

	public static void main(String[] args) {
		ElectronicDevice ed = new ElectronicDevice();
		ed.setName("Radio");
		try {
			ed.setWatt(-100);	
		} catch(IllegalWattException e) {
			System.out.println("Negative Watt sind nicht erlaubt!");
		}
	}

}
