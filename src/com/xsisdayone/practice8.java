package com.xsisdayone;

import java.util.Scanner;

//konversi temperatur dari foreinheit ke kelvin
// rumus : kelvin = (foreinheit + 459.67)/1.8
public class practice8 {
    static final double cf= 459.67;
    static final double cd = 1.8;

    public static void main(String[] args) {
        double kelvin, fareinheit;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Temperature in farenheit : ");
        fareinheit = scan.nextDouble();
        kelvin = (fareinheit+ cf)/cd;
        System.out.println("After Conversion Kelvin : "+kelvin);
    }
}
