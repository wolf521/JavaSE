package enum_description;

public class EnumDescription {
	/**
	 * 1:ʲô��ö��
	 *  ĳ����ӵ�����޸���������ʵ������
	 *  
	 * 2:�Զ���ö������ö����ʲô����
	 *  ʹ��enum������ö�٣�������󣬷�����final���εģ������������࣬Ĭ�ϼ̳�ENUM��
	 *  �Զ���Ŀ��������࣬���Լ̳������࣬����ʵ�ֽӿ�
	 *  
	 * 3:ö�ٺͳ�����ʲô����
	 *  ö�ٿ��Ա�֤����Ľ�׳�ԣ���ȫ�ԣ��ɿ��ԣ�����ʱ���ɼ�⵽ʵ���Ƿ�Ϸ�
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Season s = Season.FALL;
		Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;  
        
        System.out.println(f1 == f2);  
        System.out.println(f3 == f4);  
	}
}
