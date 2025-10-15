package Job_test;

import java.util.Scanner;

public class jobtest4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan angka: ");
        int x = input.nextInt();

        for (int i = 2; i <= x && i < 10; i++){
            boolean prime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(i + " ");
            }
        }
    }
}
