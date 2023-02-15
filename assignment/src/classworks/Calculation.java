package classworks;

public class Calculation {
//	Using in main class with static.
	public static void addition(int n1, int n2) {
		System.out.println("Sum:"+(n1+n2));
	}
//	public static void main(String [] args) {
//		int a=20, b=10;
//		Calculator c = new Calculator();
//		c.sum(a, b);
//		c.minus(a,b);
//		c.multiply(a,b);
//		c.divide(a, b);
//		Calculation.addition(a, b);
//	}
	 

}
//Using class based approach.
class Calculator{
	public void sum(int num1, int num2) {
		System.out.println("The Sum of two numbers "+num1+"and "+num2+"is:"+(num1+num2));
//		System.out.println(num1+"is number");
	}
	public void minus(int num1, int num2) {
		System.out.println("The Difference of two numbers "+num1+"and "+num2+"is:"+(num1-num2));
	}
	public void multiply(int num1, int num2) {
		System.out.println("The product of two numbers "+num1+"and "+num2+"is:"+(num1*num2));
	}
	public void divide(int num1, int num2) {
		System.out.println("The division of two numbers "+num1+"and "+num2+"is:"+(num1/num2));
	}
}