public class Test {

	public static void main(String[] args) {
		System.out.println(0.9 == (1.1 - 0.2));
		System.out.println(Double.compare(0.9, 1.1 - 0.2));
		System.out.println(Math.abs(0.9 - (1.1 - 0.2)) < 0.0000000001);
	}

}
