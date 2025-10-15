package Job_test;

import java.util.Scanner;

public class jobtest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan angka: ");
        int x = input.nextInt();

        if (x % 2 != 0) {
            System.out.printf("Angka %d adalah bilangan ganjil", x);
        } else {
            System.out.printf("Angka %d adalah bilangan genap", x);
        }
    }
}
