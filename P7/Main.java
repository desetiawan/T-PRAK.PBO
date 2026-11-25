package P7;

public class Main {

    public static void main(String[] args) {
        Mahasiswa mhs1;

        mhs1 = new Mahasiswa("Budi Santoso", "2024001", 3.65);
        Mahasiswa mhs2 = new Mahasiswa("Siti Aminah", "2024002", 3.20);

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.setNama("Andi Wijaya");
        mhs3.setNim("2024003");
        mhs3.setIpk(2.80);

        System.out.println();

        mhs1.tampilkanData();
        mhs2.tampilkanData();
        mhs3.tampilkanData();

        mhs2.setIpk(3.90);
        System.out.println("Setelah IPK Siti diubah:");
        mhs2.tampilkanData();

        Mahasiswa mhs4 = mhs1;
        mhs4.setNama("Budi (diubah lewat mhs4)");
        System.out.println("Nama mhs1 sekarang: " + mhs1.getNama());

        System.out.println("Total objek Mahasiswa dibuat: " + Mahasiswa.getJumlahObjek());
    }
}
