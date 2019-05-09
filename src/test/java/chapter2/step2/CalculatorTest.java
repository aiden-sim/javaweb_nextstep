package chapter2.step2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * junit 이용
 * 한 번에 메소드 하나에만 집중
 */
public class CalculatorTest {
	private Calculator cal;

	@Before
	public void setup() {
		cal = new Calculator(); // 매번 다시 생성됨
	}

	@Test
	public void add() {
		assertEquals(9, cal.add(6, 3)); // 자동화
	}

	@Test
	public void subtract() {
		assertEquals(3, cal.subtract(6, 3)); // 자동화
	}
}
