package P4;

import java.util.Locale;
import java.util.Scanner;

public class Salesman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale indonesia = Locale.forLanguageTag("id-ID");

        System.out.print("Masukkan nama salesman           : ");
        String nama = input.nextLine();

        System.out.print("Masukkan total penjualan hari ini (Rp): ");
        long penjualan = input.nextLong();

        double uangJasa;
        double persenKomisi;

        if (penjualan <= 2000000) {
            uangJasa = 100000;
            persenKomisi = 0.10;
        } else if (penjualan <= 5000000) {
            uangJasa = 200000;
            persenKomisi = 0.15;
        } else {
            uangJasa = 300000;
            persenKomisi = 0.20;
        }

        double komisi = persenKomisi * penjualan;
        double totalPendapatan = uangJasa + komisi;

        System.out.println();
        System.out.println("======= PENDAPATAN SALESMAN =======");
        System.out.println("Nama Salesman     : " + nama);
        System.out.println("Total Penjualan   : " + String.format(indonesia, "Rp%,d", penjualan));
        System.out.println("-----------------------------------");
        System.out.println("Uang Jasa         : " + String.format(indonesia, "Rp%,.0f", uangJasa));
        System.out.println("Komisi (" + (int) (persenKomisi * 100) + "%)     : " + String.format(indonesia, "Rp%,.0f", komisi));
        System.out.println("-----------------------------------");
        System.out.println("TOTAL PENDAPATAN  : " + String.format(indonesia, "Rp%,.0f", totalPendapatan));
        System.out.println("===================================");

        input.close();
    }
}
