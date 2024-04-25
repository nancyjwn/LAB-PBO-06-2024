class Laptop extends Product{
	int ramSize;
	String processorType;

	Laptop(String brand, int seriesNumber, double price, int ramSize, String processorType){
		this.brand = brand;
		this.seriesNumber = seriesNumber;
		this.price = price;
		this.ramSize = ramSize;
		this.processorType = processorType;
	}

	public void displayInfo(){
		super.displayInfo();
		System.out.println("RAM Size : " + this.ramSize);
		System.out.println("Processor Type : " + this.processorType);
	}
}