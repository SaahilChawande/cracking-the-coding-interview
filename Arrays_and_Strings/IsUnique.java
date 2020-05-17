
public class IsUnique {

	public static void main(String[] args) {
		/*
		Implement an algorithm to determine if a string has all unique characters. 
		What if you cannot use additional data structures? 
		*/
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for(String word: words)	{
			System.out.println(word + ": " + isUnique(word));
		}
	}
	
	public static boolean isUnique(String s)	{
		if(s.length() > 128)
			return false;
		boolean[] char_set = new boolean[128];
		for(int i = 0; i < s.length(); i++)	{
			char letter = s.charAt(i);
			if(char_set[letter])	{
				return false;
			}
			char_set[letter] = true;
		}
		return true;
	}
}
