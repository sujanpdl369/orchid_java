package assignment_1;

public class all_datatypes {
	public static void main(String args []) {
//		This Program shows the use of all datatypes and their arithmetic operation.
		System.out.println("Use of all datatypes");
		int number;
		char character;
		float decimal;
		number = 2;
		character = 'h';
		decimal = 25.3f;
		System.out.println("Integer value = "+number);
		System.out.println("Character used = "+character);
		System.out.println("Floating point variable = "+decimal);
		System.out.println("\nTheir arithmetic operations:");
//		additions
		System.out.println("Addition between Number and floating point data : "+(number+decimal));
//		Subtractions
		System.out.println("Subtraction between Integer and floating point data : "+(number - decimal));
		
	}

}
