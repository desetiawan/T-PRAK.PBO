package tugaspraktikum2;

public class OperasiMatematika {
       static int tambah(int a, int b) {
        return a + b;
    }

    static int kurang(int a, int b) {
        return a - b;
    }

    static int kali(int a, int b) {
        return a * b;
    }

    static double bagi(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {

        int x = 22;
        int y = 33;

        System.out.println("----OPERASI MATEMATIKA DUA BILANGAN----");
        System.out.println("Nilai x = " + x);
        System.out.println("Nilai y = " + y);
        System.out.println("---------------------------------------");
        System.out.println("Penjumlahan  : " + x + " + " + y + " = " + tambah(x, y));
        System.out.println("Pengurangan  : " + x + " - " + y + " = " + kurang(x, y));
        System.out.println("Perkalian    : " + x + " * " + y + " = " + kali(x, y));
        System.out.println("Pembagian    : " + x + " / " + y + " = " + bagi(x, y));
    }
}