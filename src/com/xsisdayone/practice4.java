package com.xsisdayone;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        double literperkilo, totaljaraktempuh, totalliter;
        Scanner scan = new Scanner(System.in);
        System.out.println("Total Jarak Tempuh : ");
        totaljaraktempuh = scan.nextDouble();
        System.out.println("Total Bensin Yang dipakai : ");
        totalliter = scan.nextDouble();
        literperkilo = totaljaraktempuh/totalliter;
        System.out.println("Satu Liter Perkilo : "+literperkilo);

    }
}
