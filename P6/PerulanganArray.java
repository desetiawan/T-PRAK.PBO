package P6;

public class PerulanganArray {
    public static void main(String[] args) {

        int[] age = {12, 4, 5, 2, 6};
        System.out.println("Perulangan for:");
        for (int i = 0; i < age.length; i++) {
            System.out.println("age[" + i + "] = " + age[i]);
        }

        System.out.println();

        System.out.println("Perulangan for-each:");
        for (int nilai : age) {
            System.out.println(nilai);
        }
    }
}