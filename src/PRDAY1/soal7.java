package PRDAY1;

import java.util.Scanner;

public class soal7 {
    public static void main(String[] args) {
        int jarak, digit1, digit2, digit3, digit4, sisa;
        Scanner scan = new Scanner (System.in);
        jarak = scan.nextInt();
        digit1= jarak/63360;
        sisa=jarak%63360;

        digit2=sisa/36;
        sisa=sisa%36;

        digit3=sisa/12;
        sisa=sisa%12;

        digit4=sisa;
        sisa=sisa%1;

        System.out.println(digit1+"miles" +digit2+" Yard" +digit3+ "inc" +digit4+ "Foot" );


    }
}
