package tuprakenam;

public class Bulldog extends Dog {
    public Bulldog(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(){
        this.position += 1;
        System.out.println("Bulldog berpindah sejauh " + position + " titik");
    }

    public void describe(){
        System.out.println("Bulldog adalah anjing petarung yang agresif dan tangguh");
        System.out.println("Rata-rata panjang bandan Bulldong adalah " + this.averageLength);
        System.out.println();
    }
}
