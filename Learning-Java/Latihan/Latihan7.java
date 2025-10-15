package Latihan;

import java.util.Scanner;

public class Latihan7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Angka: ");
        int x = input.nextInt();

        do {
            System.out.println(x);
            x = x + 20;
        } while (x < 100);
    }
}
