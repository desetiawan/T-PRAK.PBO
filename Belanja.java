package tugaspraktikum3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.DataOutputStream;
import java.io.IOException;

public class Belanja {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(
            new InputStreamReader(System.in));

        DataOutputStream output =
            new DataOutputStream(System.out);

        String nama;
        double totalBelanja, diskon, total, bayar, kembalian;

        output.writeBytes("Masukkan Nama: ");
        output.flush();
        nama = input.readLine();

        output.writeBytes("Total Belanja: Rp ");
        output.flush();
        totalBelanja = Double.parseDouble(input.readLine());

        output.writeBytes("Diskon (%): ");
        output.flush();
        diskon = Double.parseDouble(input.readLine());

        total = totalBelanja - (totalBelanja * diskon / 100);

        output.writeBytes("Bayar: Rp ");
        output.flush();
        bayar = Double.parseDouble(input.readLine());

        kembalian = bayar - total;

        output.writeBytes("\n===== STRUK BELANJA =====\n");
        output.writeBytes("Nama       : " + nama + "\n");
        output.writeBytes("Total      : Rp " + total + "\n");
        output.writeBytes("Bayar      : Rp " + bayar + "\n");
        output.writeBytes("Kembalian  : Rp " + kembalian + "\n");
        output.flush();
    }
}