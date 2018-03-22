package integer;

public class IntegerSource {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer i1 = 1;
		Integer i2 = 1;
		Integer i3 = 128;
		System.out.println(i1 == i2);
		System.out.println(i1 == i3);
		
		Integer s1 = new Integer(12);
		Integer s2 = new Integer(12);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		test(s1,s2);
		System.out.println(s1+""+s2);
	}
	
	private static void test(Integer s1,Integer s2) {
		s1 = 222;
		s2 = 444;
	}
}
