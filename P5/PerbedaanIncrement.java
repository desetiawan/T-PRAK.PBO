package P5;

public class PerbedaanIncrement {

    public static void main(String[] args) {
        int i = 0;

        System.out.println("Menggunakan i++ (post-increment):");
        while (i < 5) {
            System.out.println(i++);
        }
        System.out.println("Nilai akhir i = " + i);

        System.out.println();

        i = 0;
        System.out.println("Menggunakan ++i (pre-increment):");
        while (i < 5) {
            System.out.println(++i);
        }
        System.out.println("Nilai akhir i = " + i);
    }
}
