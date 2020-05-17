import java.util.Arrays;

public class CheckPermutation {

	public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = checkPermutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}

	}
	
	public static boolean checkPermutation(String s1, String s2) {
		if(s1.length() != s2.length())
			return false;
		char[] s1_array =  s1.toCharArray();
		char[] s2_array = s2.toCharArray();
		
		// Sort the arrays
		Arrays.sort(s1_array);
		Arrays.sort(s2_array);
		
		for(int i = 0; i < s1.length(); i++)	{
			if(s1_array[i] != s2_array[i])
				return false;
		}
		return true;
	}

}
