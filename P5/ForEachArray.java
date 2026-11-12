package P5;

public class ForEachArray {

    public static void main(String[] args) {
        int[] angka = {10, 20, 30, 40, 50};

        System.out.println("Isi array angka:");
        for (int nilai : angka) {
            System.out.println(nilai);
        }

        System.out.println();

        String[] buah = {"Apel", "Jeruk", "Mangga", "Pisang"};

        System.out.println("Isi array buah:");
        for (String nama : buah) {
            System.out.println(nama);
        }
    }
}
