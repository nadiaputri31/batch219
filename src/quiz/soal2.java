package quiz;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double Bahasa1, Bahasa2, Bahasa3, Bahasa4, rata;
        System.out.print("Input Nilai Bahasa Pemograman 1 : ");
        Bahasa1 = scan.nextInt();
        System.out.print("Input Nilai Bahasa Pemograman 2 : ");
        Bahasa2 = scan.nextInt();
        System.out.print("Input Nilai Bahasa Pemograman 3 : ");
        Bahasa3 = scan.nextInt();
        System.out.print("Input Nilai Bahasa Pemograman 4 : ");
        Bahasa4 = scan.nextInt();
        rata = (Bahasa1+Bahasa2+Bahasa3+Bahasa4)/4;

        System.out.println("Rata-Rata Nilai Anda adalah: "+rata);
    }
}
