package p7;
 public class Segitiga extends BangunDatar {

    private float alas;
    private float tinggi;

    private float sisiB;
    private float sisiC;

    public void setAlas(float alas) {
        this.alas = alas;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisiB(float sisiB) {
        this.sisiB = sisiB;
    }

    public void setSisiC(float sisiC) {
        this.sisiC = sisiC;
    }

    public float getAlas() {
        return alas;
    }

    public float getTinggi() {
        return tinggi;
    }

    public float getSisiB() {
        return sisiB;
    }

    public float getSisiC() {
        return sisiC;
    }

    @Override
    protected float luas() {
        return 0.5f * alas * tinggi;
    }

    @Override
    protected float keliling() {
        return alas + sisiB + sisiC;
    }

    @Override
    public float getLuas() {
        return luas();
    }

    @Override
    public float getKeliling() {
        return keliling();
    }
}
