package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		System.out.println("This is a square test case");
		JunitTesting test = new JunitTesting();
		int output = test.square(5);
		//int output = test.square(4);
		assertEquals(25, output);
		System.out.println(output + "\n");
	}

}
