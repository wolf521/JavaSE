package enum_description;

public enum SeasonEnum {
	/**
	 * 只能放在第一行
	 */
	SPRING("春天",1),SUMMER("夏天",2),FALL("秋天",3),WINTER("冬天",4);
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
	private SeasonEnum(String name, int value) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
}
