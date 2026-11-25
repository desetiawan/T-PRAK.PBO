package P7;

public class DataMahasiswa {
    private String nama;
    private String npm;
    private String kelas;

    public DataMahasiswa() {
        this("-", "-", "-");
    }

    public DataMahasiswa(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void inputData(String nama, String npm, String kelas) {
        this.setNama(nama);     
        this.setNpm(npm);
        this.setKelas(kelas);
    }

    public void tampilkanData() {
        System.out.println("\n+-+-Data Mahasiswa-+-+");
        System.out.println("Nama  : " + this.nama);
        System.out.println("NPM   : " + this.npm);
        System.out.println("Kelas : " + this.kelas);
    }
}