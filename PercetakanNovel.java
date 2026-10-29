package tugaspraktikum3;

import java.util.Scanner;

public class PercetakanNovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahNovel, lembarPerNovel;
        long totalDetik;
        long hari, jam, menit, detik;

        System.out.print("Masukkan banyak novel: ");
        jumlahNovel = input.nextInt();

        System.out.print("Masukkan tebal lembar per novel: ");
        lembarPerNovel = input.nextInt();

        // Kecepatan mesin: 1 lembar per detik
        totalDetik = (long) jumlahNovel * lembarPerNovel;

        // Menghitung hari, jam, menit, dan detik
        hari = totalDetik / 86400;
        totalDetik = totalDetik % 86400;

        jam = totalDetik / 3600;
        totalDetik = totalDetik % 3600;

        menit = totalDetik / 60;
        detik = totalDetik % 60;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Jumlah novel: " + jumlahNovel);
        System.out.println("Lembar per novel: " + lembarPerNovel);
        System.out.println("Waktu yang diperlukan:");
        System.out.println("Hari  : " + hari);
        System.out.println("Jam   : " + jam);
        System.out.println("Menit : " + menit);
        System.out.println("Detik : " + detik);

        input.close();
    }
}
