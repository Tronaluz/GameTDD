package RomanConverter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RomanConverterTest {

	public RomanConverter romanConverter = new RomanConverter();
	
	

	@Test
	void testNumberOne() {
		int arabicNum = 1;
		String romanNum = this.romanConverter.arabicToRoman(arabicNum);
		assertEquals(romanNum, "I");
	}
	
	@Test
	void testNumberTwo() {
		int arabicNum = 2;
		String romanNum = this.romanConverter.arabicToRoman(arabicNum);
		assertEquals(romanNum, "II");
	}
	

	@Test
	void testNumberFifty() {
		int arabicNum = 50;
		String romanNum = this.romanConverter.arabicToRoman(arabicNum);
		assertEquals(romanNum, "L");
	}
	
	@Test
	void testNumberThousandOne() {
		int arabicNum = 1001;
		String romanNum = this.romanConverter.arabicToRoman(arabicNum);
		assertEquals(romanNum, "MI");
	}


}
