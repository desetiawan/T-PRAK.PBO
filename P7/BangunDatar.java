package p7;
public abstract class BangunDatar {
    
    protected abstract float luas();

    protected abstract float keliling();

    public float getLuas() {
        return luas();
    }

    public float getKeliling() {
        return keliling();
    }
}