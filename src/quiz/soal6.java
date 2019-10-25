package quiz;

import java.util.Scanner;

public class soal6 {
    static final double pajak =0.2;
    static final double tip =.1;
    public static void main(String[] args) {
        double bar1, bar2,bar3, total1, total2, total3, total4;
        Scanner scan = new Scanner(System.in);
        System.out.print("Harga Barang 1: ");
        bar1= scan.nextDouble();
        System.out.print("Harga Barang 2: ");
        bar2= scan.nextDouble();
        System.out.print("Harga Barang 3: ");
        bar3= scan.nextDouble();
        total1= bar1+bar2+bar3;
        total2= (total1+pajak)*3;
        total3=total1/3;
        total4=total2/3;

        System.out.println("Total Harga Asli " +total1);
        System.out.println("Total Harga Setelah Terkena Pajak " +total2);
        System.out.println("Total Harga Rata-rata Sebelum Pajak " +total3);
        System.out.println("Total Harga Rata-rata Setelah Pajak " +total4);
    }
}
