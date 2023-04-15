package motorizedlandvehicle;

import vehicles.Vehicle;

public class MotorizedLandVehicle extends Vehicle {
	
	public MotorizedLandVehicle(double carTax,String carType,String plate,String tractionType,
			double priceMotorized) {
		super(carTax,carType,plate,tractionType,priceMotorized);
	}
	
	public MotorizedLandVehicle(double mileage) {
		super(mileage);
	}

	@Override
	public void calculateFinalPrice() {
		if (carType=="SUV") {
			double increase=priceMotorized*0.20;
			double commercialValue=priceMotorized+increase;
			System.out.println("El valor comercial es: "+commercialValue);
		}else {
			if(carType=="Pickup") {
				double increase=priceMotorized*0.30;
				double commercialValue=priceMotorized+increase;
				System.out.println("El valor comercial es: "+commercialValue);
			}
		}
	}
	
	@Override
	public String toString() {
		return "Motorized {" + "carTax:"+ carTax +"carType:"+carType+"plate:"+plate+"tractionType:"+tractionType;
	}
}