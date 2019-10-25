package quiz;

import java.util.Scanner;

public class soal3 {
    static final double pajak =.07;
    static final double tip =.1;
        public static void main(String[] args) {
            double har1, har2,har3, total;
            Scanner scan = new Scanner(System.in);
            System.out.print("Harga Makanan 1: ");
            har1= scan.nextDouble();
            System.out.print("Harga Makanan 2: ");
            har2= scan.nextDouble();
            System.out.print("Harga Makanan 3: ");
            har3= scan.nextDouble();
            total= (har1+har2+har3) + (tip* pajak);
            System.out.print("Total Harga Makanan " +total);

    }
}
