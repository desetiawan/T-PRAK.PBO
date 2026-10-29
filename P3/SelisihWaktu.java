package tugaspraktikum3;

import java.util.Scanner;

public class SelisihWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jam1, menit1, detik1;
        int jam2, menit2, detik2;
        int waktu1, waktu2, selisih;

        System.out.println("-WAKTU PERTAMA ");
        System.out.print("Jam: ");
        jam1 = input.nextInt();
        System.out.print("Menit: ");
        menit1 = input.nextInt();
        System.out.print("Detik: ");
        detik1 = input.nextInt();

        System.out.println("\n-WAKTU KEDUA");
        System.out.print("Jam: ");
        jam2 = input.nextInt();
        System.out.print("Menit: ");
        menit2 = input.nextInt();
        System.out.print("Detik: ");
        detik2 = input.nextInt();

        waktu1 = jam1 * 3600 + menit1 * 60 + detik1;
        waktu2 = jam2 * 3600 + menit2 * 60 + detik2;

        selisih = Math.abs(waktu1 - waktu2);

        int jam = selisih / 3600;
        int menit = (selisih % 3600) / 60;
        int detik = selisih % 60;

        System.out.println("\n=== SELISIH WAKTU ===");
        System.out.println(jam + " jam "
                           + menit + " menit "
                           + detik + " detik");

        input.close();
    }
}