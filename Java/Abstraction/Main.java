package Abstraction;

public class Main {
    public static void main(String[] args) {
		// abstract = abstract classes can not be instantiated, but they can have a subclass
		//				abstract methods are declared without an implementation

		Car car = new Car();
		//Vehicle vehicle = new Vehicle();
		
		car.go();
	}
}
