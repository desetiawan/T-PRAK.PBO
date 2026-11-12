package P5;

public class SegitigaBintang {

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Half Triangle");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= 2 * i - 1; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int tengah = 3;

        System.out.println("Full Triangle");

        for (int i = 1; i <= tengah; i++) {
            for (int s = 1; s <= tengah - i; s++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= 2 * i - 1; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = tengah - 1; i >= 1; i--) {
            for (int s = 1; s <= tengah - i; s++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= 2 * i - 1; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
