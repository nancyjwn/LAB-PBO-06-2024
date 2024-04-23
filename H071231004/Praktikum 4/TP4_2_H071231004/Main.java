public class Main {
    public static void main(String[] args) {
        System.out.println("===============================");
        Buku buku1 = new Buku();
        buku1.setJudul("hutan");
        buku1.setDurasi(2);
        buku1.setPengarang("wowo");
        buku1.setGendre("fiksi");
        buku1.setSinopsis("turu");
        buku1.displayInfo();

        Buku buku2 = new Buku("monyong", 2, "wono", "fantasi", "halo monyong");
        System.out.println(buku2.getJudul());
        System.out.println(buku2.getDurasi());
        System.out.println(buku2.getPengarang());
        System.out.println(buku2.getGendre());
        System.out.println(buku2.getSinopsis());
        System.out.println();
        
        SelfData.diplaySelfData();
    }
}
