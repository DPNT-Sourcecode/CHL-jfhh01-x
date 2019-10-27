package befaster.solutions.CHL;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckLiteTest {

	@Test
	public void testR2() {
		CheckliteSolution test = new CheckliteSolution();
		Integer expected = 210;
		Integer actual = test.checklite("EBEEBBBB");
		assertEquals(expected, actual);
		System.out.println(actual);
	}
	
	@Test
	public void testR3F2() {
		CheckliteSolution test = new CheckliteSolution();
		Integer expected = 230;
		Integer actual = test.checklite("EBEEBBBBFF");
		assertEquals(expected, actual);
		System.out.println(actual);
	}
	
	@Test
	public void testR3F3() {
		CheckliteSolution test = new CheckliteSolution();
		Integer expected = 230;
		Integer actual = test.checklite("FEBEEBBBBFF");
		assertEquals(expected, actual);
		System.out.println(actual);
	}
	
	@Test
	public void testR4() {
		CheckliteSolution test = new CheckliteSolution();
		Integer expected = 680;
		Integer actual = test.checklite("KFEBEQEKUBRQBBBRFFRUUU");
		assertEquals(expected, actual);
		System.out.println(actual);
	}
}
