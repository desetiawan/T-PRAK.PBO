package P7;

public class Dosen extends Civitas {

    private String nidn;
    private String programStudi;

    public Dosen(String nama, String nidn, String programStudi) {
        super(nama, "Dosen");  
        this.nidn = nidn;
        this.programStudi = programStudi;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData(); 
        System.out.println("NIDN   : " + nidn);
        System.out.println("Prodi  : " + programStudi);
    }
}
