
package tugaspraktikum2;

public class ManipulasiString {
    static String keHurufKecil(String s) {
        return s.toLowerCase();
    }

    static String keHurufBesar(String s) {
        return s.trim().toUpperCase();
    }

    public static void main(String[] args) {

        String a = "Saya Belajar Java";
        String b = " Saya Belajar Java";

        System.out.println("------------MENGUBAH STRING------------");
        System.out.println("---------------------------------------");

        System.out.println("String a sebelum : \"" + a + "\"");
        System.out.println("String a sesudah : \"" + keHurufKecil(a) + "\"");

        System.out.println();

        System.out.println("String b sebelum : \"" + b + "\"");
        System.out.println("String b sesudah : \"" + keHurufBesar(b) + "\"");

        System.out.println("---------------------------------------");
    }
}


