package P6;

class ThreadBaru extends Thread {

    ThreadBaru(String nama) {
        super(nama);
        System.out.println("Thread dibuat : " + getName());
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(getName() + " : hitung mundur " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " terputus.");
        }
        System.out.println(getName() + " selesai.");
    }
}

public class ThreadDemo {

    public static void main(String[] args) {

        System.out.println("Thread utama dimulai.");

        ThreadBaru t = new ThreadBaru("Thread-Anak");

        try {
            t.join(); 
        } catch (InterruptedException e) {
            System.out.println("Thread utama terputus.");
        }

        System.out.println("Thread utama selesai.");
    }
}