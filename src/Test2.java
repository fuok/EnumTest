public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String cName = Color.getCName(1);
		System.out.println(cName);

	}

	public enum Color {
		RED("red", 1), GREEN("green", 2), YELLOW("yellow", 3);
		private String name;
		private int index;

		private Color() {

		}

		private Color(String name, int index) {
			this.name = name;
			this.index = index;
		}

		public static String getCName(int index) {
			for (Color c : Color.values()) {
				if (c.getIndex() == index) {
					return c.name;
				}
			}

			return null;

		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}

	}

}
