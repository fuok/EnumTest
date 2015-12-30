public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String cName = Color.getCName(1);
		System.out.println(cName);
		System.out.println("-----------------");
		Color c = Color.RED;
		System.out.println(c.index);
		System.out.println(c.toString());
	}

	// 如果打算自定义自己的方法，那么必须在enum实例序列的最后添加一个分号。而且Java要求必须先定义enum 实例。
	// 既然枚举是常量，这样写也就相当于是定义几个静态对象了
	public enum Color {

		RED("red", 1), GREEN("green", 2), YELLOW("yellow", 3);

		// 成员变量
		private String name;
		private int index;

		// 构造方法
		private Color(String name, int index) {
			this.name = name;
			this.index = index;
		}

		// 普通方法
		public static String getCName(int index) {
			for (Color c : Color.values()) {
				if (c.getIndex() == index) {
					return c.name;
				}
			}
			return null;
		}

		// getter setter
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

		@Override
		public String toString() {// 重写枚举方法
			return this.index + "_" + this.name;
		}

	}

}
