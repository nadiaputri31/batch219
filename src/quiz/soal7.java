package quiz;

import java.util.Scanner;

public class soal7 {
    public static void main(String[] args) {
        double bb,tb, BMI;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Berat Badan : ");
        bb = scan.nextDouble();
        System.out.print("Input Tinggi Badan :");
        tb = scan.nextDouble();
        BMI= bb/(tb*tb);
        System.out.println("BMI = " +BMI);

    }
}
