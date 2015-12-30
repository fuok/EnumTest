public class Test {

	//枚举作为常量
	enum Signal {
		GREEN, YELLOW, RED
	}

	static class TrafficLight {

		public Signal color = Signal.RED;

		public Signal change() {
			switch (color) {//switch支持枚举
			case RED:
				color = Signal.GREEN;
				break;
			case YELLOW:
				color = Signal.RED;
				break;
			case GREEN:
				color = Signal.YELLOW;
				break;
			}
			return color;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TrafficLight trafficLight = new TrafficLight();
		System.out.println(trafficLight.change());
	}
}
