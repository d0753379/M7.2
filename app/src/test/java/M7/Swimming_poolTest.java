package M7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Swimming_poolTest {
	@Test
	void test1() {
		Swimming_pool x = new Swimming_pool(true, false, false, 22, 1, 2);
		Exception exception = assertThrows(Exception.class,
				() -> x.countPrice());
		assertEquals("Error", exception.getMessage());
	}

	@Test
	void test2() throws Exception {
		Swimming_pool x = new Swimming_pool(true, false, false, 7, 1, 13);
		x.countPrice();
		

		assertEquals(250, x.price);
	}

	@Test
	void test3() throws Exception {
		Swimming_pool x = new Swimming_pool(false, false, false, 7, 1, 13);
		x.countPrice();

		assertEquals(200, x.price);
	}

	@Test
	void test4() throws Exception {
		Swimming_pool x = new Swimming_pool(false, false, false, 5, 0, 3);
		x.countPrice();

		assertEquals(160, x.price);
	}
	@Test
	void test5() throws Exception {
		Swimming_pool x = new Swimming_pool(false, false, true, 5, 0, 60);
		x.countPrice();

		assertEquals(140, x.price);
	}

	@Test
	void test6() throws Exception {
		Swimming_pool x = new Swimming_pool(true, true, true, 5, 0, 3);
		x.countPrice();

		assertEquals(125, x.price);
	}
	@Test
	void test7() throws Exception {
		Swimming_pool x = new Swimming_pool(false, true, true, 5, 0, 3);
		x.countPrice();

		assertEquals(100, x.price);
	}

	@Test
	void test8() {
		Swimming_pool x = new Swimming_pool(true, false, false, 7, 1, 76);
		Exception exception = assertThrows(Exception.class,
				() -> x.countPrice());
		assertEquals("Error", exception.getMessage());
	}
	// 補涵蓋度
	@Test
	void test9() throws Exception {
		Swimming_pool x = new Swimming_pool(false, false, false, 7, 0, 60);
		x.countPrice();
		assertEquals(160, x.price);
	}
	@Test
	void test10() throws Exception {
		Swimming_pool x = new Swimming_pool(false, false, false, 8, 0, 60);
		x.countPrice();
		assertEquals(160, x.price);
	}
	@Test
	void test11() throws Exception {
		Swimming_pool x = new Swimming_pool(false, false, false, 8, 0, 3);
		x.countPrice();
		assertEquals(160, x.price);
	}


	
	
}
