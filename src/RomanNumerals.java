public class RomanNumerals {
	
	public final String[] ROMAN_NUMERALS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	public final int[] INTS_FROM_ROMAN = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	
	public int convertToInteger(String romanNum) {
		
		String[] nums = romanNum.split("");
		int result = 0;
		int[] ints = new int[nums.length];

		int x = 0;
		for (int i = 0; i < INTS_FROM_ROMAN.length; i++ ) {
		    while (romanNum.indexOf(ROMAN_NUMERALS[i]) == 0) {
		        ints[x] = INTS_FROM_ROMAN[i];
		        romanNum = romanNum.substring(ROMAN_NUMERALS[i].length());
		        x++;
		    }
		}
		
		for(int i = 0; i < ints.length; i++) {
			result = result + ints[i];
		}
		
		return result;
	}
}
