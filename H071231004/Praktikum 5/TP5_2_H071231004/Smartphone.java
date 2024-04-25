class Smartphone extends Product{
	double screenSize;
	int storageCapacity;

	Smartphone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity){
		this.brand = brand;
		this.seriesNumber = seriesNumber;
		this.price = price;
		this.screenSize = screenSize;
		this.storageCapacity = storageCapacity;
	}

	public void displayInfo(){
		super.displayInfo();
		System.out.println("Screen Size : "+ this.screenSize);
		System.out.println("Storage Capacity : " + this.storageCapacity);
	}
}