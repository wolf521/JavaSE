package enum_description;
/**
 * �Զ���ö����
 * 
 * @author Administrator
 *
 */
public class Season {
	public final static Season SPRING = new Season("����", 1);
	public static final Season SUMMER = new Season("����", 2);
	public static final Season FALL = new Season("����", 3);
	public static final Season WINTER = new Season("����", 4);
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
	private Season(String name, int value) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.value = value;
	}

}
