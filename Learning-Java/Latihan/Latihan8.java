package Latihan;

import java.util.Scanner;

public class Latihan8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, random, hearth;
        random = (int) (Math.random() * 10);
        hearth = 5;

        System.out.println("-- Permainan Tebak Angka --");
        while (true) {
            if (hearth > 0) {
                System.out.print("Nyawa kamu: " + hearth + "\nMasukan angka 0 - 10: ");
                x = input.nextInt();

                if (x == random) {
                    System.out.print("Game Over: Selamat kamu berhasil");
                    break;
                } else if (x < random) {
                    System.out.println("\nMessage: Angka terlalu kecil");
                } else {
                    System.out.println("\nMessage: Angka terlalu besar");
                }

            } else {
                System.out.print("Game Over: Kamu kehabisan nyawa huhu...");
                break;
            }

            hearth -= 1;
        }
    }
}
