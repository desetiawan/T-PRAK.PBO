package P7;

import java.util.Scanner;
public class TebakTanggalLahir {
    public static int kali(int angka, int pengali) {
        return angka * pengali;
    }
    
    public static int tambah(int angka, int penambah) {
        return angka + penambah;
    }
    
    public static int kurang(int angka, int pengurang) {
        return angka - pengurang;
    }

    public static int tebak(int bulan, int tanggal) {
        int hasil = kali(bulan, 5);   
        hasil = tambah(hasil, 6);     
        hasil = kali(hasil, 4);       
        hasil = tambah(hasil, 9);    
        hasil = kali(hasil, 5);       
        hasil = tambah(hasil, tanggal); 
        hasil = kurang(hasil, 165);   
        return hasil;
    }

    public static boolean valid(int bulan, int tanggal) {
        return bulan >= 1 && bulan <= 12 && tanggal >= 1 && tanggal <= 31;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bulan lahir (1-12)    : ");
        int bulan = input.nextInt();

        System.out.print("Masukkan tanggal lahir (1-31)  : ");
        int tanggal = input.nextInt();

        if (valid(bulan, tanggal)) {
            System.out.println("Hasil akhir = " + tebak(bulan, tanggal));
        } else {
            System.out.println("Input tidak valid. Bulan harus 1-12 dan tanggal 1-31.");
        }

        input.close();
    }
}
