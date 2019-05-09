package chapter2.step1;

public class Calculator {
	int add(int i, int j) {
		return i + j;
	}

	int subtract(int i, int j) {
		return i - j;
	}

	int multiply(int i, int j) {
		return i * j;
	}

	int divide(int i, int j) {
		return i / j;
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(9, 3));
		System.out.println(cal.subtract(9, 3));
		System.out.println(cal.multiply(9, 3));
		System.out.println(cal.divide(9, 3));
	}
}
