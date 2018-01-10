import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class exampleTest {

	@Test
	void test() {
		example e = new example();
		int result = e.addNums(2, 2);
		assertEquals(4, result);
	}

}
