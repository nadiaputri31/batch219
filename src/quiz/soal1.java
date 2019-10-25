package quiz;

import java.util.Scanner;

public class soal1 {
    static final int total=180;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suduta, sudutb, sudutc;
        System.out.print("Sudut A : ");
        suduta = scan.nextInt();
        System.out.print("Sudut B: ");
        sudutb = scan.nextInt();
        sudutc = total - (suduta + sudutb);
        System.out.println("Jumlah Sudut Segitiga Adalah: "+sudutc);
    }
}
