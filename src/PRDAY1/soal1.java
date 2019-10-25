package PRDAY1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        int input, digit, hasil;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Integer");
        input=scan.nextInt();
        digit= (input%10);
        hasil= digit * 8;
        System.out.println("The result is : "+hasil);
    }
}
