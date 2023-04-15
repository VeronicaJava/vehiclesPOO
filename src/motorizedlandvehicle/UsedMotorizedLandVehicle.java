package motorizedlandvehicle;


public class UsedMotorizedLandVehicle extends MotorizedLandVehicle {
	
	public UsedMotorizedLandVehicle(double mileage) {
		super(mileage);
		
	}
	
	@Override
	public void calculateFinalPrice() {
		
	}
	
	@Override
	public String toString() {
		return "UsedMotorized {" + "mileage:"+ mileage;
	}
}