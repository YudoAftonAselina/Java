package Program_test;

import java.util.Date;

public class date {
    public static void main (String[] args) {
        double x = 10.0 / 3.0;
        System.out.printf("%15.2f \n",x);
        System.out.printf("Selamat pagi %s, umur anda %d dan tinggi badan anda %10.2f \n", "Budi", 20, 175.4);

        Date tanggal = new Date();

//        System.out.printf("Tanggal hari ini : %td - %tB - %tY \n",tanggal,tanggal,tanggal);

        System.out.printf("Tanggal hari ini : %td - %<tB - %<tY \n",tanggal);
    }
}
