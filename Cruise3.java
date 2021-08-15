public class Cruise {

    // Class Variables
    private String cruiseName;
    private String cruiseShipName;
    private String departurePort;
    private String destination;
    private String returnPort;

    // Constructor - default
    Cruise() {
    }

    // Constructor - full
    Cruise(String tCruiseName, String tShipName, String tDeparture, String tDestination, String tReturn) {
        cruiseName = tCruiseName;
        cruiseShipName = tShipName;
        departurePort = tDeparture;
        destination = tDestination;
        returnPort = tReturn;
    }

    // Accessors
    public String getCruiseName() {
        return cruiseName;
    }

    public String getCruiseShipName() {
        return cruiseShipName;
    }

    public String getDeparturePort() {
        return departurePort;
    }

    public String getDestination() {
        return destination;
    }

    public String getReturnPort() {
        return returnPort;
    }

    // Mutators
    public void setCruiseName(String tVar) {
        cruiseName = tVar;
    }

    public void setCruiseShipName(String tVar) {
        cruiseShipName = tVar;
    }

    public void setDeparturePort(String tVar) {
        departurePort = tVar;
    }

    public void setDestination(String tVar) {
        destination = tVar;
    }

    public void setReturnPort(String tVar) {
        returnPort = tVar;
    }

    // print cruise details
    public void printCruiseDetails() {
    	int shipsAvailable;
    	boolean shipInPort = true;
    	String cruises_Available = "";
    	shipsAvailable = 20 - cruiseName.length(0);
    	while (shipInPort != false) {
    		System.out.println("Cruises Available: " + shipsAvailable);
    		System.out.println("---------------------------------");
    		for ( int i = 1; i <= shipsAvailable; i++) {
    			cruises_Available = cruises_Available + " ";
    		 		
    	// complete this method
    	//destination,returnPort,departurePort,cruiseShipname,cruiseName
    	System.out.printf("%-15s | %-15s | %-15s | %-25s | %-15s\n", cruiseName, departurePort, returnPort, cruiseShipName, destination );
    	System.out.println("--------------------------------------------");
    		}
    	}
    	
    	
    }

    // method added to print ship's name vice memory address
    @Override
    public String toString() {
        return cruiseName;
    }
}
