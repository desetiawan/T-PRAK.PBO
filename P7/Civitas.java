package P7;

public class Civitas {

    protected String nama;
    protected String status;

    public Civitas(String nama, String status) {
        this.nama = nama;
        this.status = status;
    }

    public String getNama() {
        return nama;
    }

    public String getStatus() {
        return status;
    }

    public void tampilkanData() {
        System.out.println("Nama   : " + nama);
        System.out.println("Status : " + status);
    }
}