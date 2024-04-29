package tuprakenam;

public class GermanShepherd extends Dog {
    public GermanShepherd(int position, int averageLength){
        super(position, averageLength);
    }

    public void move(){
        this.position += 3;
        System.out.println("GermanShepherd berpindah sejauh " + position + " titik");
    }

    public void describe(){
        System.out.println("Anjing Gembala Jerman adalah salah satu ras murni anjing yang populer. Ukurannya besar, dikenal cerdas namun penurut. Anjing ini relatif tidak memiliki variasi warna, yaitu coklat dengan variasi hitam");
        System.out.println("Rata-rata panjang badan German Shepherd adalah " + this.averageLength);
        System.out.println();
    }
    
}
