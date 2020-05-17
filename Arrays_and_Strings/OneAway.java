public class OneAway {

	public static void main(String[] args) {
		System.out.println(oneAway("pale", "ple"));
		System.out.println(oneAway("pales", "pale"));
		System.out.println(oneAway("pale", "bale"));
		System.out.println(oneAway("pale", "bake"));

	}
	
	public static boolean oneAway(String a, String b)	{
		if(a.length() == b.length())	{
			return oneReplaceAway(a, b);
		}	else if(a.length() - 1 == b.length())	{
			return oneEditAway(b, a);
		}	else if(a.length() + 1 == b.length())	{
			return oneEditAway(a, b);
		}
		return false;
	}
	
	// Check replace
	public static boolean oneReplaceAway(String first, String second)	{
		boolean difference_found = false;
		for(int i = 0; i < first.length(); i++)	{
			if(first.charAt(i) != second.charAt(i))	{
				if(difference_found)	{
					return false;
				}
				difference_found = true;
			}
		}
		return true;
	}
	
	// Check one edit away
	public static boolean oneEditAway(String s1, String s2)	{
		int index1 = 0, index2 = 0;
		while(index1 < s1.length() && index2 < s2.length())	{
			if(s1.charAt(index1) != s2.charAt(index2))	{
				if(index1 != index2)	{
					return false;
				}
				index2++;
			}	else	{
				index1++;
				index2++;
			}
		}
		return true;
	}
}
