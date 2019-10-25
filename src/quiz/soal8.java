package quiz;

import java.util.Scanner;

public class soal8 {
    static final double pajak =.15;
    public static void main(String[] args) {
            double totalblj, discount, hemat;
            Scanner scan = new Scanner(System.in);
            System.out.print("Total Belanja : ");
            totalblj = scan.nextDouble();
            System.out.print("Diskon % :");
            discount = scan.nextDouble();
            hemat= totalblj - (totalblj * discount/100);
            System.out.println("Uang yang Dihemat sebesar " +hemat);
    }
}
