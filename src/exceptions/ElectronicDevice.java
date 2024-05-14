package exceptions;

public class ElectronicDevice {
	
	private String name;
	private int watt;
	
	
	public ElectronicDevice() {}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWatt() {
		return watt;
	}
	public void setWatt(int watt) {
		if(watt > 0) {
			this.watt = watt;
		}else {
			throw new IllegalWattException();
		}
	}
	
}
