package P7;

public class Mahasiswa1 extends Civitas {

    private String nim;
    private String programStudi;
    private int angkatan;

    public Mahasiswa1(String nama, String nim, String programStudi, int angkatan) {
        super(nama, "Mahasiswa");
        this.nim = nim;
        this.programStudi = programStudi;
        this.angkatan = angkatan;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("NIM      : " + nim);
        System.out.println("Prodi    : " + programStudi);
        System.out.println("Angkatan : " + angkatan);
    }
}

