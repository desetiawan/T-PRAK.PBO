package P7;

public class Mahasiswa {
    private String nama;
    private String nim;
    private double ipk;

    private static int jumlahObjek = 0;

    public Mahasiswa() {
        this.nama = "Belum diisi";
        this.nim = "-";
        this.ipk = 0.0;
        jumlahObjek++;
        System.out.println("[Konstruktor default dipanggil] objek ke-" + jumlahObjek + " dibuat");
    }

    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
        jumlahObjek++;
        System.out.println("[Konstruktor berparameter dipanggil] objek ke-" + jumlahObjek + " dibuat");
    }

    public void tampilkanData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("IPK  : " + ipk);
        System.out.println("Predikat: " + getPredikat());
        System.out.println("---------------------------");
    }

    public String getPredikat() {
        if (ipk >= 3.5) {
            return "Cum Laude";
        } else if (ipk >= 3.0) {
            return "Sangat Memuaskan";
        } else if (ipk >= 2.5) {
            return "Memuaskan";
        } else {
            return "Cukup";
        }
    }

    // GETTER dan SETTER (enkapsulasi)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("IPK tidak valid (harus 0.0 - 4.0)");
        }
    }

    public static int getJumlahObjek() {
        return jumlahObjek;
    }
}