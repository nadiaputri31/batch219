package com.xsisdayone;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        //hitung luas persegi panjang
        Scanner scan = new Scanner(System.in);
        int panjang, lebar, luas;
        System.out.println("Panjang: ");
        panjang = scan.nextInt();
        System.out.println("Lebar: ");
        lebar = scan.nextInt();
        luas = panjang*lebar;
        System.out.println("Luas Persegi Panjang adalah : "+luas);
    }
}
