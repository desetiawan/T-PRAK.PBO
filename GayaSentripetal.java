package tugaspraktikum3;

import java.util.Scanner;

public class GayaSentripetal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double massa, kecepatan, jariJari, gaya;

        System.out.print("Masukkan massa (kg): ");
        massa = input.nextDouble();

        System.out.print("Masukkan kecepatan (m/s): ");
        kecepatan = input.nextDouble();

        System.out.print("Masukkan jari-jari (m): ");
        jariJari = input.nextDouble();

        if (jariJari > 0) {
            gaya = massa * kecepatan * kecepatan / jariJari;
            System.out.println("Gaya sentripetal = "
                               + gaya + " N");
        } else {
            System.out.println("Jari-jari harus lebih dari 0.");
        }

        input.close();
    }
}
