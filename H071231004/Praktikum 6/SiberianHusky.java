package tuprakenam;

public class SiberianHusky extends Dog {

    public SiberianHusky(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(){
        this.position += 2;
        System.out.println("SiberianHusky berpindah sejauh " + position + " titik");
    }

    public void describe(){
        System.out.println("SiberianHusky termasuk dalam jenis anjing ras berukuran sedang dan berbulu tebal. Anjing ras ini termasuk jinak dan ramah kepada siapa pun");
        System.out.println("Rata-rata penjang badan Siberian Husky adalah " + this.averageLength);
        System.out.println();
    }
}
