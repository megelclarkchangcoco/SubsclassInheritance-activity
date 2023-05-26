package SubclassInherits;

public class Car {
	
	private String name;
	private String tire;
	
	
	// Constructor for the Car class
    public Car(String name, String tire) {
        this.name = name;
        this.tire = tire;
    }
    
 // Method to make the Car flat
    public void drive() {
        System.out.println("The " +name + " is " + tire);
    }
    
}
