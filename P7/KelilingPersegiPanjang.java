package P7;

import java.util.Scanner;
public class KelilingPersegiPanjang {

    public static double hitungKeliling(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    public static void tampilkanHasil(double panjang, double lebar, double keliling) {
        System.out.println("\n*Hasil Perhitungan*");
        System.out.println("Panjang  : " + panjang);
        System.out.println("Lebar    : " + lebar);
        System.out.println("Keliling : 2 x (" + panjang + " + " + lebar + ") = " + keliling);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar  : ");
        double lebar = input.nextDouble();

        double keliling = hitungKeliling(panjang, lebar);

        tampilkanHasil(panjang, lebar, keliling);

        input.close();
    }
}
