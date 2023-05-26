package SubclassInherits;
//Getting Pumped - up(individual Activity)(Apply Inheritance & Overriding)
//b) create a subclass of plane class and name it U-2 Spy Plane. which has 
//the following properties and methods (wings span and method fly())
//
//c) create a sybclass of boat class and name it Fandago Yacht. which has 
//the following properties and methods (MainSail Color and method float())

// main method 
public class Main {
	public static void main (String[] args) {
		
		// Create an instance of FandagoYacht using constructor
		FandagoYacht fy = new FandagoYacht("AirCraft Carrier", "Navy Blue");
		fy.doFloat(); // Invoke methods on FandagoYacht
		
		// Create an instance of U2SpyPlane using constructor
		U2SpyPlane u2 = new U2SpyPlane("F- 16", 31);
		u2.fly();// Invoke methods on U2SpyPlane
		
		Vehicle vehicle = new Vehicle("Toyota - Vios", "Flat");
		vehicle.drive();
	}
	
}
