package PRDAY1;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        int input, hasil;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Integer : ");
        input = scan.nextInt();
        hasil= (input%2);
        System.out.println("The Result Is : "+hasil);
    }
}
