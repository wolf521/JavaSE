package enum_description;

public enum SeasonEnum {
	/**
	 * ֻ�ܷ��ڵ�һ��
	 */
	SPRING("����",1),SUMMER("����",2),FALL("����",3),WINTER("����",4);
	/**
	 * ���Բ����޸�
	 */
	private final String name;
	private final int value;
	/**
	 * ���췽��ֻ���ڲ�ʹ��
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
