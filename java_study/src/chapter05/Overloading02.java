package chapter05;

class Order{
	void placeOrder(String dish) {
		System.out.println(dish);
	}
	void placeOrder(String dish, int quantitiy) {
		System.out.println(dish + ", "+ quantitiy);
	}
	void placeOrder(String dish, String spe) {
		System.out.println(dish+ ", "+ spe);
	}
	
}

public class Overloading02 {
	public static void main(String[] args) {
		Order o= new Order();
		
	}

}
