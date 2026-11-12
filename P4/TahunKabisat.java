package P4;

import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();

        if (tahun % 400 == 0) {
            System.out.println(tahun + " adalah tahun KABISAT");
        } else if (tahun % 100 == 0) {
            System.out.println(tahun + " bukan tahun kabisat");
        } else if (tahun % 4 == 0) {
            System.out.println(tahun + " adalah tahun KABISAT");
        } else {
            System.out.println(tahun + " bukan tahun kabisat");
        }

        input.close();
    }
}
