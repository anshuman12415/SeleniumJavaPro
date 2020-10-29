
public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void demo() throws Exception {

		System.out.println("hello w");
		throw new ArithmeticException("not valid operation");
		// int i = 1 / 0;
		// System.out.println("completed");

	}

}
