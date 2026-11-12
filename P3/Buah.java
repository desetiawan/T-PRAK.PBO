package tugaspraktikum3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Buah {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(
            new InputStreamReader(System.in));

        int mangga, jambuPerTetangga;
        int jumlahTetangga, manggaBusuk;
        int totalJambu, totalBuah;

        System.out.print("Jumlah mangga dibeli: ");
        mangga = Integer.parseInt(input.readLine());

        System.out.print("Jumlah jambu per tetangga: ");
        jambuPerTetangga = Integer.parseInt(input.readLine());

        System.out.print("Jumlah tetangga: ");
        jumlahTetangga = Integer.parseInt(input.readLine());

        System.out.print("Jumlah mangga busuk: ");
        manggaBusuk = Integer.parseInt(input.readLine());

        totalJambu = jambuPerTetangga * jumlahTetangga;
        totalBuah = (mangga - manggaBusuk) + totalJambu;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Mangga layak: "
                           + (mangga - manggaBusuk));
        System.out.println("Total jambu: " + totalJambu);
        System.out.println("Total buah akhir: " + totalBuah);

    }
}