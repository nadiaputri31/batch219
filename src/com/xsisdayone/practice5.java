package com.xsisdayone;

import java.util.Scanner;

public class practice5 {
    static final double pi=3.14;
    public static void main(String[] args) {
        //luas lingkaran
        double area, radius;
        Scanner scan = new Scanner(System.in);
        System.out.print("Radius");
        radius = scan.nextDouble();
        area = pi * (radius*radius);
        System.out.print("Luas LIngkarannya Adalah : "+area);

    }
}
