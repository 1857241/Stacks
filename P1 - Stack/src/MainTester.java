import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTester {
	Stack<Integer> temp = new Stack<Integer>();

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	@Test
	void testSize() {
		//fail("Not yet implemented");
		//assert(expected, actual)
		assertEquals(0, temp.size());
		
		
		
	}
	
	void testPush() {
		temp.push(10);
		temp.push(12);
	}
	void testPop() {
		temp.pop();
		temp.pop();
	}
	void testEmpty() {
		assertEquals(true, temp.empty());
	}
	void peek() {
		temp.push(10);
		assertEquals(10, temp.peek());
	}
}
