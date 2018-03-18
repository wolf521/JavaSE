package transfer_mode;

/**
 * 传递方式，
 * （1）基本数据类型传值，对形参的修改不会影响实参；
 * （2）引用类型传引用，形参和实参指向同一个内存地址（同一个对象），所以对参数的修改会影响到实际的对象；
 * （3）String, Integer, Double等immutable的类型特殊处理，可以理解为传值，最后的操作不会修改实参对象。
 * @author Administrator
 *
 */
public class TransferMode {
	public static void main(String[] args) {
		int a = 2;
		test(a);
		System.out.println(a);
		Integer a1 = 2;
		test(a1);
		System.out.println(a1);
		String str = new String("aaa");
		test(str);
		System.out.println(str);
		User user = new User("小明",20);
		test(user);
		System.out.println(user.toString());
	}
	/**
	 * 基本数据类型：值传递
	 * 
	 * @param a
	 */
	private static void test(int a) {
		a = 3;
		System.out.println(a);
	}
	/**
	 * String, Integer, Double等immutable的类型特殊处理，可以理解为传值
	 * 
	 * @param str
	 */
	private static void test(String str) {
		// 生成一个新的对象
		str = "bbb";
		System.out.println(str);
	}
	/**
	 * 对象，引用传递
	 * 
	 * @param user
	 */
	private static void test(User user) {
		user.setAge(30);
		user.setName("小红");
		System.out.println(user.toString());
	}
}
class User{
	private String name;
	private int age;
	
	public User() {
		super();
	}
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}
