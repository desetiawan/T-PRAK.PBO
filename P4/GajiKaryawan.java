package P4;

import java.util.Locale;
import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale indonesia = Locale.forLanguageTag("id-ID");

        System.out.print("Masukkan NIK                : ");
        String nik = input.nextLine();

        System.out.print("Masukkan Nama               : ");
        String nama = input.nextLine();

        System.out.println();
        System.out.println("Kode Golongan:");
        System.out.println("  1 = Menikah");
        System.out.println("  2 = Belum menikah");
        System.out.println("  3 = Cerai");
        System.out.println("  4 = Menikah dan punya anak");
        System.out.print("Masukkan Kode Golongan (1-4): ");
        int kodeGolongan = Integer.parseInt(input.nextLine().trim());

        System.out.print("Masukkan Status Pernikahan (Menikah/Belum menikah/Cerai): ");
        String status = input.nextLine().trim();

        System.out.print("Masukkan Jumlah Anak        : ");
        int jumlahAnak = Integer.parseInt(input.nextLine().trim());

        double gajiPokok;
        switch (kodeGolongan) {
            case 1:
                gajiPokok = 1200000;
                break;
            case 2:
                gajiPokok = 1500000;
                break;
            case 3:
                gajiPokok = 1750000;
                break;
            case 4:
                gajiPokok = 2000000;
                break;
            default:
                System.out.println("Kode golongan tidak valid! Masukkan angka 1 sampai 4.");
                input.close();
                return;
        }

        double tunjanganPasangan = 0;
        if (status.equalsIgnoreCase("Menikah")) {
            tunjanganPasangan = 0.10 * gajiPokok;
        }

        double tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;

        double totalTunjangan = tunjanganPasangan + tunjanganAnak;

        double gajiBersih = gajiPokok + totalTunjangan;

        System.out.println();
        System.out.println("========== SLIP GAJI ==========");
        System.out.println("NIK                : " + nik);
        System.out.println("Nama               : " + nama);
        System.out.println("Kode Golongan      : " + kodeGolongan);
        System.out.println("Status Pernikahan  : " + status);
        System.out.println("Jumlah Anak        : " + jumlahAnak);
        System.out.println("-------------------------------");
        System.out.println("Gaji Pokok         : " + String.format(indonesia, "Rp%,.0f", gajiPokok));
        System.out.println("Tunjangan Pasangan : " + String.format(indonesia, "Rp%,.0f", tunjanganPasangan));
        System.out.println("Tunjangan Anak     : " + String.format(indonesia, "Rp%,.0f", tunjanganAnak));
        System.out.println("Total Tunjangan    : " + String.format(indonesia, "Rp%,.0f", totalTunjangan));
        System.out.println("-------------------------------");
        System.out.println("GAJI BERSIH        : " + String.format(indonesia, "Rp%,.0f", gajiBersih));
        System.out.println("===============================");

        input.close();
    }
}