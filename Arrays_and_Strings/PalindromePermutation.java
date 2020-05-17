import java.util.*;
public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palindromePermutation("Tact Coa"));
		System.out.println(palindromePermutation("tactcoapapa"));

	}
	
	public static boolean palindromePermutation(String s) {
		/*
		 We know 'tactcoapapa' is a permutation of a palindrome because it has two Ts, four As, two Cs, two Ps and one O.
		 That O would be the center of all possible palindromes.
		 */
		s = s.replace(" ", "").toLowerCase();
		Map<Character, Integer> mapp = new HashMap<>();
		for(int i = 0; i < s.length(); i++)	{
			char current_char = s.charAt(i);
			mapp.put(current_char, mapp.getOrDefault(current_char, 0) + 1);
		}
		boolean one_element_set = false;
		for(Map.Entry<Character, Integer> mapElement: mapp.entrySet())	{
//			System.out.println("Key: " + mapElement.getKey() + " Value: " + mapElement.getValue());
			if(mapElement.getValue() == 1)	{
				if(!one_element_set)	{
					one_element_set = true;
				}	else	{
					return false;
				}
			}	else if(mapElement.getValue()%2 == 0)	{
				continue;
			}	else	{
				return false;
			}
		}
		return true;
	}

}
