package tuprakenam;

public class Main {
    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull(2, 27);
        SiberianHusky husky = new SiberianHusky(3, 100);
        Bulldog bulldog = new Bulldog(5, 50);
        GermanShepherd germanshepherd = new GermanShepherd(9, 120);

        System.out.println();

        Smartphone smartphone = new Smartphone("Samsung", 5999);
        Car car = new Car("Blue", 3, 360);

        
        System.out.println("\nBerikut adalah deskripsi dari Pitbull");
        pitbull.move();
        pitbull.describe();
        System.out.println("\nBerikut adalah deskripsi dari Siberian Husky");
        husky.move();
        husky.describe();
        System.out.println("\nBerikut adalah deskripsi dari Bulldog");
        bulldog.move();
        bulldog.describe();
        System.out.println("\nBerikut adalah deskripsi dari German Shepherd");
        germanshepherd.move();
        germanshepherd.describe();

        System.out.println("\nBerikut adalah deskripsi dari Smartphone");
        smartphone.move();
        System.out.println("\nBerikut adalah deskripsi dari Car");
        car.move();

        
        
    }

    // public static void display(Dog dog){
    //     dog.move();
    //     dog.describe();
    // }

    // public static void display(Ithink ithink){
    //     ithink.move();
    // }
}
