package java8features1;

@FunctionalInterface
interface Addition {
	int add(int a, int b);
}
public class ArithmeticOperations {
	public static void main(String[] args) {
		Addition res = (int a1, int b1) -> (a1 + b1);
		System.out.println("Addition is - " + res.add(10, 20));
		Addition aRes = (a, b) -> (a + b);
		System.out.println("Another Addition is - " + aRes.add(60, 40));
		Addition val = (a, b) -> {
			return a + b;
		};
		System.out.println("Add is " + val.add(40, 50));
	}
}
