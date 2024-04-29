package tuprakenam;

public class Smartphone implements Ithink {
    String brand;
    int price;

    public Smartphone(String brand, int price){
        this.brand = brand;
        this.price = price;
    }

    public void move(){
        System.out.println("- Smartphone berpindah");
        System.out.println("- Handphone " + this.brand + " dibanderol dengan harga " + this.price);
    }

    
}
