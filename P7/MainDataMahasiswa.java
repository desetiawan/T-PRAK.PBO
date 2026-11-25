package P7;
import java.util.Scanner;

public class MainDataMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama  : ");
        String nama = input.nextLine();

        System.out.print("Masukkan NPM   : ");
        String npm = input.nextLine();

        System.out.print("Masukkan kelas : ");
        String kelas = input.nextLine();

        DataMahasiswa mhs = new DataMahasiswa();
        System.out.println("\nSebelum diisi:");
        mhs.tampilkanData();

        mhs.inputData(nama, npm, kelas);
        System.out.println("\nSesudah diisi:");
        mhs.tampilkanData();

        input.close();
    }
}