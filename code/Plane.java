package SubclassInherits;

//Base class representing a generic plane
class Plane {
	 private String name; // Name of the plane
	 private double wingspan; // Wingspan of the plane

	 // Constructor for the Plane class
    public Plane(String name, double wingspan) {
        this.name = name;
        this.wingspan = wingspan;
    }
    
    // Method to make the plane fly
    public void fly() {
        System.out.println(name + " is flying with a wingspan of " + wingspan + " meters.");
    }
}