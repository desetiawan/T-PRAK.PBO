
package tugaspraktikum3;

import java.util.Scanner;

public class GajiPegawai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nik, nama, alamat, jabatan;
        double gajiPokok, tunjanganJabatan;
        double tunjanganIstri, tunjanganAnak;
        double totalGaji, pajak, gajiBersih;

        System.out.print("Nomor Induk Karyawan: ");
        nik = input.nextLine();

        System.out.print("Nama Karyawan: ");
        nama = input.nextLine();

        System.out.print("Alamat: ");
        alamat = input.nextLine();

        System.out.print("Jabatan: ");
        jabatan = input.nextLine();

        System.out.print("Gaji Pokok: ");
        gajiPokok = input.nextDouble();

        System.out.print("Tunjangan Jabatan: ");
        tunjanganJabatan = input.nextDouble();

        System.out.print("Tunjangan Istri: ");
        tunjanganIstri = input.nextDouble();

        System.out.print("Tunjangan Anak: ");
        tunjanganAnak = input.nextDouble();

        totalGaji = gajiPokok + tunjanganJabatan
                  + tunjanganIstri + tunjanganAnak;

        pajak = 0.10 * (gajiPokok + tunjanganJabatan
                      + tunjanganAnak);

        gajiBersih = totalGaji - pajak;

        System.out.println("\n=== DATA GAJI PEGAWAI ===");
        System.out.println("NIK                 : " + nik);
        System.out.println("Nama                : " + nama);
        System.out.println("Alamat              : " + alamat);
        System.out.println("Jabatan             : " + jabatan);
        System.out.println("Total Gaji          : Rp " + totalGaji);
        System.out.println("Pajak Penghasilan   : Rp " + pajak);
        System.out.println("Gaji Bersih         : Rp " + gajiBersih);

        input.close();
}
}