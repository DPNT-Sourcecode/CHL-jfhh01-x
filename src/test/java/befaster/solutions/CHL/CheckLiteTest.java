package befaster.solutions.CHL;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckLiteTest {

	@Test
	public void test() {
		CheckliteSolution test = new CheckliteSolution();
		assertEquals(20, test.checklite("AACD"));
	}
}
