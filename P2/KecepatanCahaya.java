package tugaspraktikum2;

public class KecepatanCahaya {
     static double hitungWaktu(double jarak, double kecepatan) {
        return jarak / kecepatan;
    }
    
    static String formatWaktu(double detik) {
        int menit = (int) (detik / 60);
        double sisa = detik % 60;
        return menit + " menit " + String.format("%.2f", sisa) + " detik";
    }
    
    public static void main(String[] args) {
        
        double jarakBulan    = 384400;        
        double jarakMatahari = 152100000;     
        double kecepatanCahaya = 300000;     
        
        double waktuBulan    = hitungWaktu(jarakBulan, kecepatanCahaya);
        double waktuMatahari = hitungWaktu(jarakMatahari, kecepatanCahaya);
        
        System.out.println("=========== WAKTU TEMPUH CAHAYA =================");
        System.out.println("Kecepatan cahaya : " + kecepatanCahaya + " km/s");
        System.out.println("-------------------------------------------------");
        System.out.printf("Bumi Bulan     : %.4f detik%n", waktuBulan);
        System.out.printf("Bumi Matahari  : %.2f detik (%s)%n", 
                          waktuMatahari, formatWaktu(waktuMatahari));
    }
}
