package tugaspraktikum3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(
            new InputStreamReader(System.in));

        System.out.print("Masukkan nama: ");
        String nama = input.readLine();

        System.out.print("Masukkan umur: ");
        int umur = Integer.parseInt(input.readLine());

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
}