package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class countAtest {

	@Test
	public void test() {
		System.out.println("This is an A counter test case");
		JunitTesting test = new JunitTesting();
		int output = test.countA("Hello this is a java test!");
		//assertEquals(5, output);
		assertEquals(3, output);
		System.out.println(output + "\n");
	}

}
