package Job_test;

import java.util.Scanner;

public class jobtest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan angka: ");
        int x = input.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
