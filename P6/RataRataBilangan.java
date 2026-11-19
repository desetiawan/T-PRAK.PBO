package P6;

import java.util.Scanner;

public class RataRataBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        while (n <= 0) {
            System.out.print("Masukkan jumlah bilangan: ");
            String teks = input.nextLine().trim();
            try {
                n = Integer.parseInt(teks);
                if (n <= 0) {
                    System.out.println("Jumlah bilangan harus lebih dari 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Kesalahan: \"" + teks + "\" bukan bilangan bulat. Silakan ulangi.");
            }
        }

        double[] data = new double[n];

        for (int i = 0; i < n; i++) {
            boolean valid = false;
            while (!valid) {
                System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                String teks = input.nextLine().trim().replace(',', '.');
                try {
                    double nilai = Double.parseDouble(teks);
                    if (Double.isNaN(nilai) || Double.isInfinite(nilai)) {
                        throw new NumberFormatException();
                    }
                    data[i] = nilai;
                    valid = true;
                } catch (NumberFormatException e) {
                    System.out.println("Kesalahan: \"" + teks + "\" bukan bilangan. Silakan ulangi.");
                }
            }
        }

        double total = 0;
        for (int i = 0; i < n; i++) {
            total += data[i];
        }
        double rataRata = total / n;

        System.out.println();
        System.out.print("Bilangan yang dimasukkan : ");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println("Jumlah                   : " + total);
        System.out.println("Rata-rata                : " + rataRata);
    }
}
