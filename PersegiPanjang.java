package tugaspraktikum2;

public class PersegiPanjang {
    
    static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }
    
    public static void main(String[] args) {
        
        int panjang = 50;
        int lebar   = 45;
        
        int luas = hitungLuas(panjang, lebar);
        
        System.out.println("=== MENGHITUNG LUAS PERSEGI PANJANG ===");
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar   : " + lebar);
        System.out.println("---------------------------------------");
        System.out.println("Luas    : " + luas);
    }
}
