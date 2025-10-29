package Latihan;

import java.util.Scanner;

public class Latihan10 {
    public static void main(String[] args) {
        int tebakan = 8;
        int inputUser;
        boolean tertebak = false;
        int i = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PERMAINAN TEBAK ANGKA ===");
        System.out.println("Tebak angka antara 1-10");
        System.out.println("Anda memiliki 5 kesempatan");

        while ((i < 5) && (!tertebak)) {
            System.out.print("\nTebakan ke-" + (i + 1) + ": ");
            inputUser = sc.nextInt();

            if (tebakan == inputUser) {
                tertebak = true;
                System.out.println("Selamat! Tebakan Anda benar!");
            } else {
                System.out.println("Salah! Coba lagi.");
                // Beri petunjuk
                if (inputUser < tebakan) {
                    System.out.println("Hint: Angka lebih besar dari " + inputUser);
                } else {
                    System.out.println("Hint: Angka lebih kecil dari " + inputUser);
                }
            }
            i++;
        }

        if (tertebak) {
            System.out.println("\nAnda berhasil menebak dalam " + i + " percobaan!");
        } else {
            System.out.println("\nNyawa anda habis! Angka yang benar adalah: " + tebakan);
        }

        sc.close();
    }
}