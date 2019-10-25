package quiz;

import java.util.Scanner;

public class soal5 {
        public static void main(String[] args) {
            double fahreinhet, konversi;
            Scanner scan = new Scanner(System.in);
            System.out.print("Input Temperature in Fahreinhet : ");
            fahreinhet = scan.nextDouble();
            konversi = (fahreinhet-32)*5/9;
            System.out.println("After Conversion Fahrenhet : "+konversi);
    }
}
