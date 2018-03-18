package transfer_mode;

/**
 * ���ݷ�ʽ��
 * ��1�������������ʹ�ֵ�����βε��޸Ĳ���Ӱ��ʵ�Σ�
 * ��2���������ʹ����ã��βκ�ʵ��ָ��ͬһ���ڴ��ַ��ͬһ�����󣩣����ԶԲ������޸Ļ�Ӱ�쵽ʵ�ʵĶ���
 * ��3��String, Integer, Double��immutable���������⴦���������Ϊ��ֵ�����Ĳ��������޸�ʵ�ζ���
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
		User user = new User("С��",20);
		test(user);
		System.out.println(user.toString());
	}
	/**
	 * �����������ͣ�ֵ����
	 * 
	 * @param a
	 */
	private static void test(int a) {
		a = 3;
		System.out.println(a);
	}
	/**
	 * String, Integer, Double��immutable���������⴦���������Ϊ��ֵ
	 * 
	 * @param str
	 */
	private static void test(String str) {
		// ����һ���µĶ���
		str = "bbb";
		System.out.println(str);
	}
	/**
	 * �������ô���
	 * 
	 * @param user
	 */
	private static void test(User user) {
		user.setAge(30);
		user.setName("С��");
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
