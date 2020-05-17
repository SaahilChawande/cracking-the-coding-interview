
public class StringRotation {

	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		System.out.println(isSubstring(s1, s2));
		
		s1 = "hello";
		s2 = "elloh";
		System.out.println(isSubstring(s1, s2));
		
		s1 = "abcd";
		s2 = "def";
		System.out.println(isSubstring(s1, s2));
	}
	
	private static boolean isSubstring(String s1, String s2)	{
		// s1 is the main string
		// s2 is the rotated string
		s2 = s2 + s2;
		if(s2.contains(s1)) {
			return true;
		}
		return false;
	}

}
