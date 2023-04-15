package vehicles;

import motorizedlandvehicle.MotorizedLandVehicle;

public class VehicleMain {

	public static void main(String[] args) {
		
		Vehicle human = new HumanPoweredVehicule("chevrolet", "2010",5000, "spark");
		human.calculateFinalPrice();
		
		Vehicle motorized = new MotorizedLandVehicle(50000, "Pickup","CDF453", "FWD",25000);
		motorized.calculateFinalPrice();
	}
}