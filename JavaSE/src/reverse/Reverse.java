package reverse;

/**
 * ·´×ª×Ö·û´®
 * 
 * @author Administrator
 *
 */
public class Reverse {
	public static void main(String[] args) {
		System.out.println(reverse("fgdsgfdhsjgh"));
	}

	public static String reverse(String originStr) {
		if (originStr == null || originStr.length() <= 1)
			return originStr;
		return reverse(originStr.substring(1)) + originStr.charAt(0);
	}
}
