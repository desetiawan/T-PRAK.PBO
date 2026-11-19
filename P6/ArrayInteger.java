package P6;

public class ArrayInteger {

    public static void main(String[] args) {
        int[] arr1;              
        arr1 = new int[5];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

        int arr2[] = new int[5]; 
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (i + 1) * 5;   
        }

        int[] arr3 = {1, 2, 3, 4, 5};

        System.out.println("Variasi 1: deklarasi dan new terpisah");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }

        System.out.println();
        System.out.println("Variasi 2: int arr[] = new int[5]");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }

        System.out.println();
        System.out.println("Variasi 3: inisialisasi langsung {1, 2, 3, 4, 5}");
        for (int nilai : arr3) {
            System.out.println("nilai = " + nilai);
        }
    }
}
