package Latihan;

import java.util.Scanner;

public class Latihan12 {
    public static void main (String[] args) {
        int[] tinggi; // deklarasi
        tinggi = new int[] {3, 6, 3}; // inisialisasi dengan kurung kurawal

        // Menampilkan semua elemen array
        System.out.println("Elemen array:");
        for(int i = 0; i < tinggi.length; i++) {
            System.out.println("Tinggi indeks ke-" + i + " adalah " + tinggi[i]);
        }

        // Fasilitas pencarian
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nAngka yang akan dicari? ");
        int angkaCari = scanner.nextInt();

        // Mencari angka dalam array
        System.out.print("Angka tersebut ada di indeks: ");
        boolean ditemukan = false;

        for(int i = 0; i < tinggi.length; i++) {
            if(tinggi[i] == angkaCari) {
                if(ditemukan) {
                    System.out.print(", ");
                }
                System.out.print(i);
                ditemukan = true;
            }
        }

        // Jika tidak ditemukan
        if(!ditemukan) {
            System.out.print("Tidak ditemukan");
        }

        scanner.close();
    }
}
