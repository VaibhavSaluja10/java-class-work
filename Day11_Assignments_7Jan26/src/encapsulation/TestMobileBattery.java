package encapsulation;

public class TestMobileBattery {
	public static void main(String[] args) {
		MobileBattery mb = new MobileBattery();
		mb.setBatteryLevel(0);
		System.out.println("After set to 0: " + mb.getBatteryLevel());

		mb.setBatteryLevel(-9);
		System.out.println("After set to -9: " + mb.getBatteryLevel());

		mb.setBatteryLevel(10);
		System.out.println("After set to 10: " + mb.getBatteryLevel());

		mb.charge(9);
		System.out.println("After set to 9: " + mb.getBatteryLevel());

		mb.setBatteryLevel(100);
		System.out.println("After set to 100: " + mb.getBatteryLevel());

		mb.setBatteryLevel(104);
		System.out.println("After set to 104: " + mb.getBatteryLevel());
	}

}
