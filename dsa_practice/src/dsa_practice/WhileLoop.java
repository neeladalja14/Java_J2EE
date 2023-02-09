package dsa_practice;

public class WhileLoop {

	public static void main(String[] args) {
		int value = 0;

		while (value < 10) {
			value += 1;
			System.out.println("Hello " + value);

		}

		for (int i = 0; i < 5; i++) {
			System.out.printf("Value of i is %d\n", i);
			// Note1: here the %d is the value specifier. which means %d is i. 
			// Note2: \n is used to leave a line after the string. because "printf" gives output in single line.
			// Note3: "println" gives output in new line
		}
	}

}
