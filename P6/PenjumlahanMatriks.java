package P6;

import java.util.Scanner;

public class PenjumlahanMatriks {
    static int bacaInt(Scanner input, String pesan, int min) {
        while (true) {
            System.out.print(pesan);
            String teks = input.nextLine().trim();
            try {
                int nilai = Integer.parseInt(teks);
                if (nilai < min) {
                    System.out.println("Input minimal " + min + ".");
                } else {
                    return nilai;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa bilangan bulat.");
            }
        }
    }

    static int[][] bacaMatriks(Scanner input, String namaMatriks, int baris, int kolom) {
        int[][] m = new int[baris][kolom];
        System.out.println("Masukkan elemen matriks " + namaMatriks + ":");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                m[i][j] = bacaInt(input, namaMatriks + "[" + i + "][" + j + "] = ", Integer.MIN_VALUE);
            }
        }
        return m;
    }

    static void tampilMatriks(String judul, int[][] m) {
        System.out.println(judul);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%6d", m[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int baris = bacaInt(input, "Masukkan jumlah baris  : ", 1);
        int kolom = bacaInt(input, "Masukkan jumlah kolom  : ", 1);

        int[][] a = bacaMatriks(input, "A", baris, kolom);
        int[][] b = bacaMatriks(input, "B", baris, kolom);

        int[][] hasil = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println();
        tampilMatriks("Matriks A:", a);
        System.out.println();
        tampilMatriks("Matriks B:", b);
        System.out.println();
        tampilMatriks("Hasil A + B:", hasil);
    }
}

