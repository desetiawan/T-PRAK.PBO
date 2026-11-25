package P7;

public class MainCivitas {
    
 public static void main(String[] args) {
        Civitas[] daftar = {
            new Dosen("Dr. Ahmad Fauzi, M.T.", "0401018801", "Teknik Informatika"),
            new Dosen("Ir. Rina Lestari, M.Sc.", "0415058503", "Teknik Sipil"),
            new Mahasiswa1("Budi Santoso", "2024001", "Teknik Informatika", 2024),
            new Mahasiswa1("Siti Aminah", "2023015", "Teknik industri", 2023),
            new Staff("Dewi Anggraini, S.Kom.", "198905122015", "Administrasi Akademik"),
            new Staff("Joko Prasetyo", "199203302018", "Laboratorium Komputer")
        };

        System.out.println("===== DATA CIVITAS AKADEMIKA FAKULTAS TEKNIK =====\n");

        for (Civitas c : daftar) {
            c.tampilkanData();
            System.out.println("--------------------------------------------");
        }

        System.out.println("Total civitas: " + daftar.length + " orang");
    }
}
