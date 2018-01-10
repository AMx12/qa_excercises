package jUnitTests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class PeopleArrayTest {

	Person p = new Person("Paul", 22, "Police Officer");
	Person p1 = new Person("Nick", 22, "Tesco Retail Assistant");
	Person p2 = new Person("Philip", 21, "Scotmid Retail Assistant");
	Person p3 = new Person("Andrew", 21, "Java Developer");

	@Test
	void test(Object returnedPerson) {

		assertEquals("Paul", p.getName());
		assertEquals("Nick", p1.getName());
		assertEquals("Philip", p2.getName());
		assertEquals("Andrew", p3.getName());

		assertEquals(22, p.getAge());
		assertEquals(22, p1.getAge());
		assertEquals(21, p2.getAge());
		assertEquals(21, p3.getAge());

		assertEquals("Police Officer", p.getJob());
		assertEquals("Tesco Retail Assistant", p1.getJob());
		assertEquals("Scotmid Retail Assistant", p2.getJob());
		assertEquals("Java Developer", p3.getJob());

		assertEquals(p, returnedPerson);

	}

	void testFoundName() {

	}

}
