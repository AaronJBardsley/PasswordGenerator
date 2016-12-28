
public class PasswordDemo {

	public static void main(String[] args) {
		
//		RandomPassword letterTest = new RandomPassword(16, false, false);
//		System.out.println(letterTest.lettersPassword());
//		
		RandomPassword alphanumericTest = new RandomPassword(12, true, false);
		System.out.println(alphanumericTest.alphanumericPassword());
//
//		RandomPassword alphasymbolicTest = new RandomPassword(16, false, true);
//		System.out.println(alphasymbolicTest.alphasymbolicPassword());
//
//		RandomPassword alphanumericsymbolicTest = new RandomPassword(16, true, true);
//		System.out.println(alphanumericsymbolicTest.alphanumericsymbolicPassword());
		
	}
}
