import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void convertToInteger_II_is_2() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		int result = romanNumerals.convertToInteger("II");
		
		assertEquals("2", 2, result);
	}
	
	@Test
	public void convertToInteger_Vto5() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		int result = romanNumerals.convertToInteger("V");
		
		assertEquals("V", 5, result);
	}
	
	@Test
	public void convertToInteger_Xto10() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		int result = romanNumerals.convertToInteger("X");
		
		assertEquals("X", 10, result);
	}
	
	@Test
	public void convertToInteger_Lto50() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		int result = romanNumerals.convertToInteger("L");
		
		assertEquals("L", 50, result);
	}
	
	@Test
	public void convertToInteger_Cto100() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		int result = romanNumerals.convertToInteger("C");
		
		assertEquals("C", 100, result);
	}
	
	@Test
	public void convertToInteger_Dto500() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		int result = romanNumerals.convertToInteger("D");
		
		assertEquals("D", 500, result);
	}
	
	@Test
	public void convertToInteger_Mto1000() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		int result = romanNumerals.convertToInteger("M");
		
		assertEquals("M", 1000, result);
	}
	
	@Test
	public void convertToInteger_VIIIto8() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		int result = romanNumerals.convertToInteger("VIII");
		
		assertEquals("VIII", 8, result);
	}
	
	@Test
	public void convertToInteger_DCCCto800() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		int result = romanNumerals.convertToInteger("DCCC");
		
		assertEquals("DCCC", 800, result);
	}
	 
	@Test
	public void convertToInteger_IVto4() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		int result = romanNumerals.convertToInteger("IV");
		
		assertEquals("IV", 4, result);
	}
	
	@Test
	public void convertToInteger_IXto9() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		int result = romanNumerals.convertToInteger("IX");
		
		assertEquals("IX", 9, result);
	}
	
	@Test
	public void convertToInteger_XLto40() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		int result = romanNumerals.convertToInteger("XL");
		
		assertEquals("XL", 40, result);
	}
	
	@Test
	public void convertToInteger_XCto90() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		int result = romanNumerals.convertToInteger("XC");
		
		assertEquals("XC", 90, result);
	}
	
	@Test
	public void convertToInteger_CDto400() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		int result = romanNumerals.convertToInteger("CD");
		
		assertEquals("CD", 400, result);
	}
	
	@Test
	public void convertToInteger_CMto900() {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		int result = romanNumerals.convertToInteger("CM");
		
		assertEquals("CM", 900, result);
	}
	 
	
	
	@Test
	public void convertToInteger_MCMLXXXIVto1984 () {
		
		RomanNumerals romanNumerals = new RomanNumerals();
		
		int result = romanNumerals.convertToInteger("MCMLXXXIV");
		
		assertEquals("MCMLXXXIV", 1984, result);
	}
	
}
