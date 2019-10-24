package com.xsisdayone;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("FirstName: ");
        String firstName = scan.nextLine();
        System.out.println("lastName: ");
        String lastName= scan.nextLine();
        System.out.println("FullName: "+firstName+" "+lastName);
    }
}
