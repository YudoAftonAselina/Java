package Latihan;

import java.util.Scanner;

public class Latihan5 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner Input

        float penghasilan, total, pajak;

        System.out.print("Masukan penghasilan: ");
        penghasilan = scan.nextFloat();

        System.out.println("-- Perhitungan Penghasilan --");
        if (penghasilan < 1000) {
            pajak = 0;
            total = penghasilan - (penghasilan * pajak);
        } else if (penghasilan < 2000) {
            pajak = 0.05f;
            total = penghasilan - (penghasilan * pajak);
        } else if (penghasilan < 5000) {
            pajak = 0.1f;
            total = penghasilan - (penghasilan * pajak);
        } else {
            pajak = 0.2f;
            total = penghasilan - (penghasilan * pajak);
        }

        System.out.println(" Pajak: " + (pajak * 100) + "%");
        System.out.println(" Pajak yang harus dibayar: Rp " + (penghasilan * pajak));
        System.out.printf(" Penghasilan pre-pajak: Rp %.2f \n", penghasilan);
        System.out.printf(" Penghasilan post-pajak: Rp %.2f ", total);
    }
}