package assignment_1;

public class FibDoWhile {
//	This program generates 10 Fibonacci number using do while loop.
	public static void main(String [] args) {
		int n1 = 0, n2=1;
		int fib =0,i=0;
		System.out.println("Fibbonacci number using do while loop.");
		do {
			fib = n1+n2;
			n1 = n2;
			n2 = fib;
			System.out.println(fib);
			i++;
		}while(i<10);
	}
		
	

}
