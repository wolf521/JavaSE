package enum_description;
/**
 * 自定义枚举类
 * 
 * @author Administrator
 *
 */
public class Season {
	public final static Season SPRING = new Season("春天", 1);
	public static final Season SUMMER = new Season("夏天", 2);
	public static final Season FALL = new Season("秋天", 3);
	public static final Season WINTER = new Season("冬天", 4);
	/**
	 * 属性不可修改
	 */
	private final String name;
	private final int value;
	/**
	 * 构造方法只能内部使用
	 * 
	 * @param name
	 * @param value
	 */
	private Season(String name, int value) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.value = value;
	}

}
