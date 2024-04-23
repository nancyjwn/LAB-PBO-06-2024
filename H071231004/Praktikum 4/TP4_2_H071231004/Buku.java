public class Buku {
    private String judul;
    private int durasi;
    private String pengarang;
    private String gendre;
    private String sinopsis;

    public Buku(){};

    public Buku(String judul, int durasi, String pengarang, String gendre, String sinopsis){
        this.judul = judul;
        this.durasi = durasi;
        this.pengarang = pengarang;
        this.gendre = gendre;
        this.sinopsis = sinopsis;
    }

    public void setJudul(String judul){
        this.judul = judul ;
    }

    public void setDurasi(int durasi){
        this.durasi = durasi;
    }

    public void setPengarang (String pengarang){
        this.pengarang = pengarang;
    }

    public void setGendre(String gendre){
        this.gendre = gendre;
    }

    public void setSinopsis(String sinopsis){
        this.sinopsis = sinopsis;
    }

    public String getJudul(){
        return judul;
    }

    public int getDurasi(){
        return durasi;
    }

    public String getPengarang(){
        return pengarang;
    }

    public String getGendre(){
        return gendre;
    }

    public String getSinopsis(){
        return sinopsis;
    }

    public void displayInfo(){
        System.out.println("Judul: " + judul);
        System.out.println("Durasi: " + durasi);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Gendre: " + gendre);
        System.out.println("Sinopsis: " + sinopsis);
    }
}
