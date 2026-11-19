package P6;

public class Mobil {

    public static void main(String[] args) {

        String[] mobil = {"tesla", "suzuki", "Civic", "Mazda", "BMW"};

        int indeks = -1;
        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equalsIgnoreCase("Suzuki")) {
                indeks = i;
                break;
            }
        }

        if (indeks != -1) {
            System.out.println("Nilai sebelum diubah : " + mobil[indeks]);
            mobil[indeks] = "Toyota";
            System.out.println("Indeks yang diubah   : " + indeks);
            System.out.println("Nilai sesudah diubah : " + mobil[indeks]);
        } else {
            System.out.println("Nilai \"Suzuki\" tidak ditemukan di dalam array.");
        }
    }
}
