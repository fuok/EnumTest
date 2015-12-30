
public class Test3 {

	public static void main(String[] args) {
		Food f = Food.Coffee.CAPPUCCINO;
		System.out.println(f.toString());
	}

	// 所有的枚举都继承自java.lang.Enum类。由于Java 不支持多继承，所以枚举对象不能再继承其他类。
	public interface Behaviour {
		void print();

		String getInfo();
	}

	public enum Color implements Behaviour {
		RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4); // 成员变量
		private String name;
		private int index;

		// 构造方法
		private Color(String name, int index) {
			this.name = name;
			this.index = index;
		}

		// 接口方法
		@Override
		public String getInfo() {
			return this.name;
		}

		// 接口方法
		@Override
		public void print() {
			System.out.println(this.index + ":" + this.name);
		}
	}

	// ------------------------------------------------

	// 使用接口组织枚举
	public interface Food {
		enum Coffee implements Food {
			BLACK_COFFEE, DECAF_COFFEE, LATTE, CAPPUCCINO
		}

		enum Dessert implements Food {
			FRUIT, CAKE, GELATO
		}
	}
}
