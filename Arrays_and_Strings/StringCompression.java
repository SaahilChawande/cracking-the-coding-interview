public class StringCompression {

	public static void main(String[] args) {
		System.out.println(stringCompression("aabcccccaaa"));

	}
	
	public static String stringCompression(String input)	{
		int counter = 0;
		int i = 0;
		StringBuffer output = new StringBuffer();
		while(i < input.length())	{
			char current_char = input.charAt(i);
			counter = 1;
			while(i < input.length() && current_char == input.charAt(i))	{
				counter++;
				i++;
			}
			counter--;
			output.append(current_char + "" + counter);
		}
		return output.toString();
	}

}
