package vehicles;

public class HumanPoweredVehicule extends Vehicle {
	
	public HumanPoweredVehicule(String brand,String model,double price,String reference) {
		super(brand,model,price,reference);
	}
	
	@Override
	public void calculateFinalPrice() {
		double valueSubsidy = price*0.25;
		System.out.println("El valor del descuento es: "+valueSubsidy);
	}
	
	@Override
	public String toString() {
		return "Human {" + "brand:"+ brand +"model:"+model+"price:"+price+"reference:"+reference;
	}
}