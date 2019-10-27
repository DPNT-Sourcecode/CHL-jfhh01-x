package befaster.solutions.CHL;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckLiteTest {

	@Test
	public void test() {
		CheckliteSolution test = new CheckliteSolution();
		Integer expected = 210;
		Integer actual = test.checklite("EBEEBBBB");
		assertEquals(expected, actual);
		System.out.print(actual);
	}
}




