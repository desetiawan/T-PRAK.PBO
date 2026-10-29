package P4;

import java.util.Locale;
import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale indonesia = Locale.forLanguageTag("id-ID");

        System.out.print("Apakah memiliki kartu member? (y/t) : ");
        String jawaban = input.nextLine().trim();

        System.out.print("Masukkan total belanja (Rp)          : ");
        long totalBelanja = input.nextLong();

        System.out.print("Masukkan uang yang diberikan (Rp)    : ");
        long uangDiberikan = input.nextLong();

        long diskon;

        if (jawaban.equalsIgnoreCase("y")) {
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            } else {
                diskon = 0;
            }
        } else {
            if (totalBelanja > 100000) {
                diskon = 10000;
            } else {
                diskon = 0;
            }
        }

        long totalBayar = totalBelanja - diskon;

        System.out.println();
        System.out.println("============= STRUK BELANJA =============");
        System.out.println("Total Belanja    : " + String.format(indonesia, "Rp%,d", totalBelanja));
        System.out.println("Diskon           : " + String.format(indonesia, "Rp%,d", diskon));
        System.out.println("Total Bayar      : " + String.format(indonesia, "Rp%,d", totalBayar));
        System.out.println("Uang Diberikan   : " + String.format(indonesia, "Rp%,d", uangDiberikan));

        if (uangDiberikan >= totalBayar) {
            long kembalian = uangDiberikan - totalBayar;
            System.out.println("Kembalian        : " + String.format(indonesia, "Rp%,d", kembalian));
        } else {
            long kurang = totalBayar - uangDiberikan;
            System.out.println("Uang Anda kurang : " + String.format(indonesia, "Rp%,d", kurang));
        }
        System.out.println("=========================================");

        input.close();
    }
}