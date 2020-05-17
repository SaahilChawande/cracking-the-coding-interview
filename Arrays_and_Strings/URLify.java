
public class URLify {

	public static void main(String[] args) {
		String str = "Mr John Smith    ";
		System.out.println("After replacing spaces: " + urlify(str, 13));

	}
	
	public static String urlify(String s, int true_length)	{
		char[] url_array = s.toCharArray();
		StringBuffer result = new StringBuffer();
		int char_count = 0;
		for(int i = 0; i < url_array.length && char_count < true_length; i++)	{
			if(url_array[i] != ' ')	{
				result.append(url_array[i]);
				char_count++;
			}	else	{
				result.append("%20");
				char_count++;
				while(i < url_array.length && url_array[i] == ' ')i++;
				i--;
			}
		}
		return result.toString();
	}

}
