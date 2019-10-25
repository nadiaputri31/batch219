package PRDAY1;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        int input, sisa, digit1, digit2, digit3, digit4, digit5, hasil;
        Scanner jodoh = new Scanner(System.in);
        System.out.println("The Number Is : ");
        input=jodoh.nextInt();
        digit1=input/1000;
        sisa=input%1000;

        digit2 = sisa/1000;
        sisa=sisa%1000;

        digit3= sisa/100;
        sisa=sisa%100;

        digit4= sisa/10;
        sisa=sisa%10;

        digit5= sisa;
        sisa=sisa%1;
        hasil = (digit5*10000)+(digit4*100)+(digit3*100)+(digit2*10)+(digit1*10);

        System.out.println("Display Result is :  "+hasil);
    }
}
