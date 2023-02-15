package case2;
import java.io.*;

public class AlexRestaurant {
//	This program is based on restaurant operated by Alex.
//	There are 5 different items which a user can order.
//	The system takes order value from the user and
//	calculates total price based on order.
	public static void display(String [] items, int []price) {
		System.out.println("Welcome to the Alex's Restaurant.");
		System.out.println("----------------MENU-------------------");
		System.out.println("SN\t\tItems\t\tPrice.");
		for(int i=0;i<5;i++) {
			System.out.println((i+1)+"\t\t"+items[i]+"\t\t"+price[i]);
		}
		System.out.println("---------------------------------------");
		System.out.println("Enter your order(6 to skip):\n");
	}
	public static void main(String [] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		String [] items =  {"Mo:Mo","Pizza","Coke","Samosa","Fanta"};
		int [] price = {170,230,50,160,40};
		int [] orders = new int[100];
		int total_price = 0;
		display(items,price);
		int i =0,j=0;
		while(true){
			orders[i] = Integer.parseInt(br.readLine());
			if(orders[i]==6) {
				System.out.println("Ordering items.");
				orders[i] = -2;
				break;
			}
			if(orders[i]>6) {
				orders[i] = -1;
				System.out.println("Value not in menu.");
				continue;
			}
			i++;
		}
		while(true) {
			if(orders[j]==-2) {
				break;
			}
			else if(orders[j]==-1) {
				continue;
			}
			total_price += price[orders[j]-1];
			j++;
		}
		System.out.println("Your Total price based on your order is:"+total_price);
	}
}
