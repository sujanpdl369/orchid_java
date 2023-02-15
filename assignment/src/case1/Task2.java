package case1;

public class Task2 {
	public static void main(String [] args) {
//		This program is developed for movie counter billing system.
		String ticketCategory = new String("golden");
		System.out.println("Movie ticket category taken : "+ticketCategory);
		int ticketRate, totalPrice, numPeople;
		numPeople = 2;
		ticketRate = 0;
		String golden = "golden", silver = "Silver";
		if(ticketCategory.equalsIgnoreCase(golden)) {
			ticketRate = 200;
		}else if(ticketCategory.equalsIgnoreCase(silver)) {
			ticketRate = 150;
		}
		totalPrice = ticketRate*numPeople;
		System.out.println("Total ticket price :"+totalPrice);
		
	}

}
