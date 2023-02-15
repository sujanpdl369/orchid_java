package assignment_1;

public class AddNumWhile {
//	This program uses do while loop for adding upto the given number
	public static void main(String [] args) {
		System.out.println("Sum of Digits with do while loop.");
		int num=55683,sum=0, val=num;
		System.out.println("Original Number :"+num);
		do {
			sum = sum + val%10;
			val/=10;
		}while(val!=0);
		System.out.println("Sum of "+num+" is: "+sum);
	}
}
