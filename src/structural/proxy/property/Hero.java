package structural.proxy.property;

public class Hero {
	
	private Property<Integer> power = new Property<>();

	public Hero(int power) {
		this.power.setValue(power);
	}

	public int getPower() {
		return this.power.getValue();
	}

	public void setPower(int power) {
		this.power.setValue(power);
	}

}
