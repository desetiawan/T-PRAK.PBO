package P4;

import java.util.Locale;
import java.util.Scanner;

public class LuasBangunDatar {

    static Scanner input = new Scanner(System.in);
    static Locale indonesia = Locale.forLanguageTag("id-ID");

    static double bacaAngka(String pertanyaan) {
        System.out.print(pertanyaan);
        String teks = input.nextLine().trim().replace(',', '.');
        return Double.parseDouble(teks);
    }

    public static void main(String[] args) {
        System.out.println("===== MENU LUAS BANGUN DATAR =====");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.println("==================================");
        System.out.print("Pilih menu (1-5): ");
        int pilihan = Integer.parseInt(input.nextLine().trim());

        double luas;

        switch (pilihan) {
            case 1:
                System.out.println("\n--- Luas Persegi ---");
                double sisi = bacaAngka("Masukkan panjang sisi : ");
                luas = sisi * sisi;
                System.out.println("Luas persegi = " + String.format(indonesia, "%,.2f", luas));
                break;

            case 2:
                System.out.println("\n--- Luas Segitiga ---");
                double alas = bacaAngka("Masukkan panjang alas : ");
                double tinggi = bacaAngka("Masukkan tinggi       : ");
                luas = 0.5 * alas * tinggi;
                System.out.println("Luas segitiga = " + String.format(indonesia, "%,.2f", luas));
                break;

            case 3:
                System.out.println("\n--- Luas Lingkaran ---");
                double jariJari = bacaAngka("Masukkan jari-jari : ");
                luas = Math.PI * jariJari * jariJari;
                System.out.println("Luas lingkaran = " + String.format(indonesia, "%,.2f", luas));
                break;

            case 4:
                System.out.println("\n--- Luas Trapesium ---");
                double sisiSejajar1 = bacaAngka("Masukkan sisi sejajar pertama : ");
                double sisiSejajar2 = bacaAngka("Masukkan sisi sejajar kedua   : ");
                double tinggiTrapesium = bacaAngka("Masukkan tinggi                : ");
                luas = 0.5 * (sisiSejajar1 + sisiSejajar2) * tinggiTrapesium;
                System.out.println("Luas trapesium = " + String.format(indonesia, "%,.2f", luas));
                break;

            case 5:
                System.out.println("\n--- Luas Layang-layang ---");
                double diagonal1 = bacaAngka("Masukkan diagonal pertama : ");
                double diagonal2 = bacaAngka("Masukkan diagonal kedua   : ");
                luas = 0.5 * diagonal1 * diagonal2;
                System.out.println("Luas layang-layang = " + String.format(indonesia, "%,.2f", luas));
                break;

            default:
                System.out.println("Pilihan tidak valid! Pilih menu 1 sampai 5.");
        }

        input.close();
    }
}
