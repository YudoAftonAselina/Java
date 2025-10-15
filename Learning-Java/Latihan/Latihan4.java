package Latihan;

import java.util.Scanner;

public class Latihan4 {
    public static void main (String[] args) {
        float panjang, lebar, luas, keliling;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan panjang persegi: ");
        panjang = scan.nextFloat();

        System.out.print("Masukan lebar persegi: ");
        lebar = scan.nextFloat();

        luas = panjang * lebar;
        keliling = 2 * (panjang + lebar);

        System.out.println("\n-- Hasil Perhitungan --");
        System.out.printf("Panjang: %.1f \n", panjang);
        System.out.printf("Lebar: %.1f \n", lebar);
        System.out.printf("Luas: %.1f \n", luas);
        System.out.printf("Keliling: %.1f ", keliling);
    }
}
