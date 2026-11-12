package P5;

import java.util.Scanner;

public class PenjumlahanRataRata {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah bilangan harus lebih dari 0.");
            return;
        }

        int total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            int angka = input.nextInt();
            total = total + angka;
        }

        double rataRata = (double) total / n;

        System.out.println("Total jumlah: " + total);
        System.out.println("Rata-rata: " + rataRata);
    }
}