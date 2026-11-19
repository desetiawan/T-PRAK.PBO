package P6;

import java.util.Scanner;

public class PRAKPBO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String npm;
        do {
            System.out.print("Masukkan NPM Anda: ");
            npm = input.next();
        } while (!npm.matches("\\d+"));
        int digitTerakhir = npm.charAt(npm.length() - 1) - '0';
        boolean npmGenap = (digitTerakhir % 2 == 0);

        int n;
        do {
            System.out.print("Masukkan jumlah elemen array: ");
            n = input.nextInt();
            if (n <= 0) {
                System.out.println("Jumlah elemen harus lebih dari 0.");
            }
        } while (n <= 0);

        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai elemen indeks ke-" + i + ": ");
            data[i] = input.nextInt();
        }

        System.out.println();
        System.out.println("===== HASIL =====");

        System.out.print("Isi array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        int max = data[0], indeksMax = 0;
        int min = data[0], indeksMin = 0;
        for (int i = 1; i < n; i++) {
            if (data[i] > max) {
                max = data[i];
                indeksMax = i;
            }
            if (data[i] < min) {
                min = data[i];
                indeksMin = i;
            }
        }
        System.out.println("Nilai terbesar  : " + max + " (indeks ke-" + indeksMax + ")");
        System.out.println("Nilai terkecil  : " + min + " (indeks ke-" + indeksMin + ")");

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += data[i];
        }
        double rataRata = (double) total / n;
        System.out.println("Jumlah semua    : " + total);
        System.out.println("Rata-rata       : " + rataRata);

        int hasil = 0;
        if (npmGenap) {
       
            for (int i = 1; i < n; i += 2) {
                hasil += data[i];
            }
            System.out.println("NPM " + npm + " berakhiran genap, maka dijumlahkan elemen berindeks GANJIL.");
            System.out.println("Jumlah elemen berindeks ganjil : " + hasil);
        } else {
     
            for (int i = 0; i < n; i += 2) {
                hasil += data[i];
            }
            System.out.println("NPM " + npm + " berakhiran ganjil, maka dijumlahkan elemen berindeks GENAP.");
            System.out.println("Jumlah elemen berindeks genap  : " + hasil);
        }

        if (hasil % 2 == 0) {
            System.out.println("Hasil penjumlahan " + hasil + " bernilai GENAP.");
        } else {
            System.out.println("Hasil penjumlahan " + hasil + " bernilai GANJIL.");
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.print("Array setelah diurutkan (kecil ke besar) : ");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}