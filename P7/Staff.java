package P7;

public class Staff extends Civitas {

    private String nip;
    private String bagian;

    public Staff(String nama, String nip, String bagian) {
        super(nama, "Staff");
        this.nip = nip;
        this.bagian = bagian;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("NIP    : " + nip);
        System.out.println("Bagian : " + bagian);
    }
}