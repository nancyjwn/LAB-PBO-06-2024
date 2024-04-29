package tuprakenam;

public class Pitbull extends Dog {

    public Pitbull(int position, int averageLength){
        super(position, averageLength);
    }

    @Override
    public void move(){
        this.position += 3;
        System.out.println("Pitbull berpindah sejauh " + position + " titik");
    }

    @Override
    public void describe(){
        System.out.println("Pitbull adalah anjing petarung yang dikembangkan di Inggris, Skotlandia, dan Irlandia abad ke-19 dari keturunan bulldog dan terrier untuk berburu");
        System.out.println("Rata-rata penjang badan Pitbull adalah " + this.averageLength);
        System.out.println();
    }
}
