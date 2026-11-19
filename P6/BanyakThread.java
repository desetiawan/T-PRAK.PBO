package P6;

import java.util.Scanner;

class ThreadKerja extends Thread {

    private final int nomor;

    ThreadKerja(int nomor) {
        super("Thread-" + nomor);
        this.nomor = nomor;
    }

    @Override
    public void run() {
        try {
            for (int langkah = 1; langkah <= 3; langkah++) {
                System.out.println(getName() + " : langkah " + langkah);
                Thread.sleep(200 * nomor);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " terputus.");
        }
        System.out.println(getName() + " selesai.");
    }
}

public class BanyakThread {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah = 0;
        while (jumlah <= 0) {
            System.out.print("Masukkan jumlah thread: ");
            String teks = input.nextLine().trim();
            try {
                jumlah = Integer.parseInt(teks);
                if (jumlah <= 0) {
                    System.out.println("Jumlah thread harus lebih dari 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa bilangan bulat.");
            }
        }

        System.out.println("Thread utama dimulai.");

        ThreadKerja[] daftarThread = new ThreadKerja[jumlah];
        for (int i = 0; i < jumlah; i++) {
            daftarThread[i] = new ThreadKerja(i + 1);
        }

        for (int i = 0; i < jumlah; i++) {
            daftarThread[i].start();
        }
  
        for (int i = 0; i < jumlah; i++) {
            try {
                daftarThread[i].join();
            } catch (InterruptedException e) {
                System.out.println("Thread utama terputus.");
            }
        }

        System.out.println("Semua thread selesai. Thread utama selesai.");
    }
}

