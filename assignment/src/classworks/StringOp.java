package classworks;

public class StringOp {
	public static void main(String [] args) {
		String nameSmall = "ankit";
		String nameCapital = "Ankit";
		System.out.println("Equals: "+nameCapital.equals(nameSmall));
		System.out.println("Equals Ignore case:"+ nameCapital.equalsIgnoreCase(nameSmall));
	}
}
