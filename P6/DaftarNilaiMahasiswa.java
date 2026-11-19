package P6;

import java.util.Scanner;

public class DaftarNilaiMahasiswa {
    static int bacaInt(Scanner input, String pesan, int min, int max) {
        while (true) {
            System.out.print(pesan);
            String teks = input.nextLine().trim();
            try {
                int nilai = Integer.parseInt(teks);
                if (nilai < min || nilai > max) {
                    System.out.println("Input harus antara " + min + " dan " + max + ".");
                } else {
                    return nilai;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa bilangan bulat.");
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jumlah = bacaInt(input, "Masukkan jumlah mahasiswa: ", 1, Integer.MAX_VALUE);

        String[] nama = new String[jumlah];
        int[] nilai = new int[jumlah];
        String[] status = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Nama  : ");
            nama[i] = input.nextLine().trim();
            nilai[i] = bacaInt(input, "Nilai : ", 0, 100);

            if (nilai[i] <= 50) {
                status[i] = "Tidak Lulus";
            } else {
                status[i] = "Lulus";
            }
        }

        int lebarNama = "Nama".length();
        for (int i = 0; i < jumlah; i++) {
            if (nama[i].length() > lebarNama) {
                lebarNama = nama[i].length();
            }
        }

        String format = "| %-3s | %-" + lebarNama + "s | %-5s | %-11s |%n";
        String garis = "+-----+-" + "-".repeat(lebarNama) + "-+-------+-------------+";

        System.out.println();
        System.out.println("Daftar Nilai Mahasiswa");
        System.out.println(garis);
        System.out.printf(format, "NO", "Nama", "Nilai", "Status");
        System.out.println(garis);
        for (int i = 0; i < jumlah; i++) {
            System.out.printf(format, String.valueOf(i + 1), nama[i], String.valueOf(nilai[i]), status[i]);
        }
        System.out.println(garis);
    }
}
