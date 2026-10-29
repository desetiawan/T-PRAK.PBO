package tugaspraktikum2;

public class KonversiSuhu {
    static double celsiusKeFahrenheit(double c) { return (c * 9 / 5) + 32; }
    static double fahrenheitKeCelsius(double f) { return (f - 32) * 5 / 9; }
    static double celsiusKeReamur(double c)     { return c * 4 / 5; }
    static double reamurKeCelsius(double r)     { return r * 5 / 4; }
    static double fahrenheitKeReamur(double f)  { return (f - 32) * 4 / 9; }
    static double reamurKeFahrenheit(double r)  { return (r * 9 / 4) + 32; }

    static String formatKoma(double nilai, int jumlahDesimal) {
        return String.format("%." + jumlahDesimal + "f", nilai).replace('.', ',');
    }

    public static void main(String[] args) {
        
        double C = 10;
        double F = 15;
        double R = 5;
        
        System.out.println("======PROGRAM KONVERSI SUHU=======");
        System.out.println("Nilai C = " + C);
        System.out.println("Nilai F = " + F);
        System.out.println("Nilai R = " + R);
        System.out.println("==================================");
        
        System.out.println("\n--- a.CELSIUS <-> FAHRENHEIT ---");
        System.out.println(formatKoma(C, 1) + " C = " + formatKoma(celsiusKeFahrenheit(C), 2) + " F");
        System.out.println(formatKoma(F, 1) + " F = " + formatKoma(fahrenheitKeCelsius(F), 2) + " C");
        
        System.out.println("\n---  b.CELSIUS <-> REAMUR  ---");
        System.out.println(formatKoma(C, 1) + " C = " + formatKoma(celsiusKeReamur(C), 2) + " R");
        System.out.println(formatKoma(R, 1) + " R = " + formatKoma(reamurKeCelsius(R), 2) + " C");
        
        System.out.println("\n--- c.FAHRENHEIT <-> REAMUR ---");
        System.out.println(formatKoma(F, 1) + " F = " + formatKoma(fahrenheitKeReamur(F), 2) + " R");
        System.out.println(formatKoma(R, 1) + " R = " + formatKoma(reamurKeFahrenheit(R), 2) + " F");
    }
}
