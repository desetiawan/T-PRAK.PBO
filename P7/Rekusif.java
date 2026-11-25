package P7;
import java.util.Scanner;

public class Rekusif{
    public static long faktorial(int n) {
        if (n <= 1) {
            return 1;                      
        }
        return n * faktorial(n - 1);       
    }

    public static void hitungMundur(int n) {
        if (n == 0) {
            System.out.println("Selesai!"); 
            return;
        }
        System.out.print(n + " ");
        hitungMundur(n - 1);               
    }

    public static int jumlahDeret(int n) {
        if (n == 0) {
            return 0;                      
        }
        return n + jumlahDeret(n - 1);     
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;                      
        }
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif (maks 20): ");
        int n = input.nextInt();

        if (n < 0 || n > 20) {
            System.out.println("Input di luar rentang 0 - 20.");
        } else {
            System.out.println("\nFaktorial " + n + "! = " + faktorial(n));

            System.out.print("Hitung mundur : ");
            hitungMundur(n);

            System.out.println("Jumlah deret 1 sampai " + n + " = " + jumlahDeret(n));

            System.out.print("Deret Fibonacci sampai suku ke-" + n + " : ");
            for (int i = 0; i <= n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
