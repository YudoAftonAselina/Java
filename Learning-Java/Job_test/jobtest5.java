package Job_test;

import java.util.Scanner;

public class jobtest5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hasil = 2;

        while (true) {
            System.out.print("Masukan angka: ");
            int x = input.nextInt();

            if (x == 0) {
                System.out.print("Selesai :3");
                break;
            }

            hasil *= x;

            System.out.println(hasil);
        }
    }
}
