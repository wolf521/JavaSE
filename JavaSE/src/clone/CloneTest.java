package clone;

public class CloneTest {
	public static void main(String agrs[]) {
		try {
			Person p1 = new Person("Hao LUO", 33, new Car("Benz", 300));
			Person p2 = CloneUtil.clone(p1); // ��ȿ�¡
			p2.getCar().setBrand("BYD");
			// �޸Ŀ�¡��Person����p2���������������Ʒ������
			// ԭ����Person����p1���������������ܵ��κ�Ӱ��
			// ��Ϊ�ڿ�¡Person����ʱ���������������Ҳ����¡��
			System.out.println(p1);
			System.out.println(p1.hashCode());
			System.out.println(p2.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
