package SubclassInherits;

//Subclass representing a Fandago Yacht
class FandagoYacht extends Boat {
	
    private String mainSailColor;// Color of the main sail
    
    // Constructor for the FandagoYacht class
    public FandagoYacht(String name, String mainSailColor) {
    	
        super(name);// Call the constructor of the superclass (Boat)
        this.mainSailColor = mainSailColor;
    }
  
}
