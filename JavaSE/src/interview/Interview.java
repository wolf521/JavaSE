package interview;

public class Interview {
	public static void main(String[] args) {
//		int a[][] = new int[10][10];
//		int [][]b = new int[10][10];
//		int []c[] = new int[10][10];
//		String s[] = new String[10];
//		System.out.println(s.length);
//		System.out.println(s[0]);
//		System.out.println(a[0][0]);
		
//		System.out.println(getCount(1,1));
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		testStringBuffer(a,b);
//		System.out.println(a +"," +b);
//		String str = new String("hello");
//		testString(str);
//		System.out.println(str);
	}
	
	public static int getCount(int count,int index) {
		if(index == 10) return count; 
		++count;
		++index;
		count = count * 2;
		return getCount(count,index);
	}
	
	public static void testStringBuffer(StringBuffer a,StringBuffer b) {
		b.append(a);
		b = a;
	}
	
	public static void testString(String str) {
		str = "ะกร๗";
	}
}
