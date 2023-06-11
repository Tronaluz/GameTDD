package RomanConverter;

public class RomanConverter {
	
	 private static final String[] ROMAN_NUMERALS = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
	 private static final int[] ARABIC_NUMERALS = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

	 public static String arabicToRoman(int number) {
	        if (number < 1 || number > 1001) {
	            return "This number cannot be converted";
	        }
	        int index = ARABIC_NUMERALS.length - 1;
	        StringBuilder romanNumber = new StringBuilder();
	        while (number > 0) {
	            if (number >= ARABIC_NUMERALS[index]) {
	                romanNumber.append(ROMAN_NUMERALS[index]);
	                number -= ARABIC_NUMERALS[index];
	            } else {
	                index--;
	            }
	        }
	        return romanNumber.toString();
	  }
}
