package tugaspraktikum2;

public class PythagorasSegitiga {
        static double hitungLuas(int a, int b) {
        return 0.5 * a * b;
    }
    
    static double hitungSisiMiring(int a, int b) {
        return Math.sqrt((a * a) + (b * b));
    }
    
    static double hitungKeliling(int a, int b, double c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        
        int a = 6;   
        int b = 8;  
        
        double luas     = hitungLuas(a, b);
        double c        = hitungSisiMiring(a, b);
        double keliling = hitungKeliling(a, b, c);
        
        System.out.println("----PERHITUNGAN SEGITIGA SIKU-SIKU----");
        System.out.println("Alas (a)     : " + a);
        System.out.println("Tinggi (b)   : " + b);
        System.out.println("--------------------------------------");
        System.out.println("Luas (L)     : " + luas);
        System.out.println("Sisi miring  : " + c);
        System.out.println("Keliling (K) : " + keliling);
    }
}
