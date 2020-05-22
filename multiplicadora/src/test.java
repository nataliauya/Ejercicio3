import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() {
		operaciones calculator=new operaciones();
		int a =2;
		int b =3;
		int actual=calculator.add(a, b);
		
		int expected=6;
		
		assertEquals(expected, actual);
	}

}
