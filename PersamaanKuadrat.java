
package tugaspraktikum2;

public class PersamaanKuadrat {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int c = 5;
        
int diskriminan = (b * b) - (4 * a * c);
        
        System.out.println("----MENGHITUNG PERSAMAAN KUADRAT----");
        System.out.println("Rumus    : D = b^2 - 4ac");
        System.out.println("Nilai a  : " + a);
        System.out.println("Nilai b  : " + b);
        System.out.println("Nilai c  : " + c);
        System.out.println("-----------------------------------");
        
        System.out.println("D        : " + b + "^2 - 4(" + a + ")(" + c + ")");
        System.out.println("D        : " + (b * b) + " - " + (4 * a * c));
        System.out.println("D        : " + diskriminan);
        
        System.out.println("-----------------------------------");
        if (diskriminan > 0) {
            System.out.println("Keterangan: Memiliki dua akar real yang berbeda.");
        } else if (diskriminan == 0) {
            System.out.println("Keterangan: Memiliki dua akar real yang kembar.");
        } else {
            System.out.println("Keterangan: Tidak memiliki akar real (akar imajiner).");
        }
    }
}