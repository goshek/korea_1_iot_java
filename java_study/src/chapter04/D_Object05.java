package chapter04;

public class D_Object05 {
	class Car{
		String color;
		int speed;
		String brand;
		static int tireNumber=4;
		
		public Car(String c, int s, String b) {
			this.color= c;
			this.speed= s;
			this.brand= b;
		}
		
		void accelerate(int increment) {
			speed +=increment; 
		}
		
	}
	public static void main(String[] args) {
		System.out.println(Car.tireNumber);
	}

}
