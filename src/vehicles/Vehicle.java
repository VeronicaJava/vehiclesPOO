package vehicles;

public abstract class Vehicle {
    
	//Human
	protected String brand;
	protected String model;
	protected double price;
	protected String reference;
	
	public Vehicle(String brand,String model,double price, String reference) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.reference = reference;
	}
	
	//Motorized
	protected double carTax;
	public String carType;
	protected String plate;
	protected String tractionType;
	protected double priceMotorized;
	
	public Vehicle(double carTax,String carType,String plate, String tractionType,double priceMotorized) {
		this.carTax = carTax;
		this.carType = carType;
		this.plate = plate;
		this.tractionType = tractionType;
		this.priceMotorized = priceMotorized;
	}
	
	//UsedMotorized
	protected double mileage;
	
	public Vehicle(double mileage) {
		this.mileage = mileage;
	}
	
	//AerialVehicule
	protected boolean hasPermissionCA;
	protected boolean registrationCertificate;
	protected String typeUse;
	
	public Vehicle(boolean hasPermissionCA,boolean registrationCertificate,String typeUse) {
		this.hasPermissionCA = hasPermissionCA;
		this.registrationCertificate = registrationCertificate;
		this.typeUse = typeUse;
	}
	
	public abstract void calculateFinalPrice();
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return brand;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getReference() {
		return reference;
	}
	
	public void setReference(String reference) {
		this.brand = reference;
	}
	
	public double getCarTax() {
		return carTax;
	}
	
	public void setCarTax(double carTax) {
		this.carTax = carTax;
	}
	
	public String getCarType() {
		return carType;
	}
	
	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	public String getPlate() {
		return plate;
	}
	
	public void setPlate(String plate) {
		this.plate = plate;
	}
	
	public String getTractionType() {
		return tractionType;
	}
	
	public void setTractionType(String tractionType) {
		this.tractionType = tractionType;
	}
	
	public double getMileage() {
		return mileage;
	}
	
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	public boolean getHasPermissionCA() {
		return hasPermissionCA;
	}
	
	public void setHasPermissionCA(boolean hasPermissionCA) {
		this.hasPermissionCA = hasPermissionCA;
	}
	
	public boolean getRegistrationCertificate() {
		return registrationCertificate;
	}
	
	public void setRegistrationCertificate(boolean registrationCertificate) {
		this.registrationCertificate = registrationCertificate;
	}
	
	public String getTypeUse() {
		return typeUse;
	}
	
	public void setTypeUse(String typeUse) {
		this.typeUse = typeUse;
	}
	
	@Override
	public String toString() {
		return "Vehicle {" + "brand:"+ brand +"model:"+model+"price:"+price+"reference:"+reference;
	}
}