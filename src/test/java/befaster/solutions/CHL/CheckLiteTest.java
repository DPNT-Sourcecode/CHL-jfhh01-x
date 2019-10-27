package befaster.solutions.CHL;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckLiteTest {

	@Test
	public void test() {
		CheckliteSolution test = new CheckliteSolution();
		Integer expected = 155;
		Integer actual = test.checklite("EBEBBB");
		System.out.print(actual);
		assertEquals("Actual: "+actual.toString(),expected, actual);
	}
}



