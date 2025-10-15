package Latihan;

public class Latihan3 {
    public static void main (String[] args) {
        float panjang, lebar, luas, keliling;
        panjang = 5;
        lebar = 5;

        luas = panjang * lebar;
        keliling = (2 * panjang) + (2 * lebar);

        System.out.printf("Panjang: %.1f \n", panjang);
        System.out.printf("Lebar: %.1f \n", lebar);
        System.out.printf("Luas: %.1f \n", luas);
        System.out.printf("Keliling: %.1f", keliling);
    }
}