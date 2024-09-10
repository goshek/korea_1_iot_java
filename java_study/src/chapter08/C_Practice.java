package chapter08;
class Animal{
	void sound() {
		System.out.println("The animal makes a sound");
	}
}

class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("bark");
	}
}



class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("meow");
	}
}

public class C_Practice {
	static void checkAnimalType(Animal Animal){
		if(Animal instanceof Dog) {
			System.out.println("dog");
		}
		else if(Animal instanceof Cat) {
			System.out.println("cat");
		}
		else {
			System.out.println("Unknown animal type");
		}
	}
	public static void main(String[] args) {
		Animal a= new Dog();
		Animal b= new Cat();
		Animal c= new Animal();
		
		checkAnimalType(a);
		checkAnimalType(b);
		checkAnimalType(c);
	}

}
