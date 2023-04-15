package aerialvehicule;

import vehicles.Vehicle;

public class AerialVehicule extends Vehicle {
	
	public AerialVehicule(boolean hasPermissionCA,boolean registrationCertificate,String typeUse) {
		super(hasPermissionCA,registrationCertificate,typeUse);	
	}
	
	public void calculateFinalPrice() {
		
	}
	
	@Override
	public String toString() {
		return "AerialVehicule{" + "hasPermissionCA:"+ hasPermissionCA+"registrationCertificate: "
	+registrationCertificate+"typeUse:"+typeUse;
	}
}