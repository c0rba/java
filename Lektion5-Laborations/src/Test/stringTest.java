package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class stringTest {

	@Test
	public void test() {
		String str1 = "This is the test case";
		//String str1 = "i do not match the expected";
		assertEquals("This is the test case", str1);
	}

}
