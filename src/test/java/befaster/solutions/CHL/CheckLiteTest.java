package befaster.solutions.CHL;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckLiteTest {

	@Test
	public void test() {
		CheckliteSolution test = new CheckliteSolution();
		Integer expected = 20;
		assertEquals(expected, test.checklite("AACD"));
	}
}

