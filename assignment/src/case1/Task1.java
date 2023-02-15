package case1;

public class Task1 {
	public static void main(String [] args) {
//		This program is the billing System for amusement park
		System.out.println("Billing System of Amusement Park:");
		int peoples = 8, ticket_rate = 400;
		int discount, total_discount,price, total_price;
		if(peoples<10) {
			discount = 0;
		}
		else {
			discount = 10;
		}
		price = peoples*ticket_rate;
		total_discount = discount*price;
		total_discount/=100;
		total_price = price - total_discount;
		System.out.println("Total Price :"+total_price);
	}
	
}
