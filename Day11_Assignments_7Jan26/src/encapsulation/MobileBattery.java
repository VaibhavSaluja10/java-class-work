//
//Write a Java program where:
//batteryLevel is private
//methods to charge and use battery
//battery level must stay between 0 and 100
//

package encapsulation;
public final class MobileBattery {
	private int batteryLevel;

	public MobileBattery() {
		this.batteryLevel = 0;
	}

	public MobileBattery(int batteryLevel) {
		setBatteryLevel(batteryLevel);
	}

	public int getBatteryLevel() {
		return batteryLevel;
	}

	public void setBatteryLevel(int batteryLevel) {
		if (batteryLevel < 0) {
			this.batteryLevel = 0;
		} else if (batteryLevel > 100) {
			this.batteryLevel = 100;
		} else {
			this.batteryLevel = batteryLevel;
		}
	}

	// Increase battery by amount; clamps to 100
	public void charge(int amount) {
		if (amount <= 0) return;
		setBatteryLevel(this.batteryLevel + amount);
	}

	// Decrease battery by amount; clamps to 0
	public void use(int amount) {
		if (amount <= 0) return;
		setBatteryLevel(this.batteryLevel - amount);
	}

}
