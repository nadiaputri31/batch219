package com.xsisdayone;

import java.util.Scanner;

public class practice6 {
    static final double pajak =.15;
    public static void main(String[] args) {
     double itemBeforeTax, itemAfterTax;
     Scanner scan = new Scanner(System.in);
        System.out.println("Harga Barang Sebelum Pajak : ");
        itemBeforeTax = scan.nextDouble();
        itemAfterTax= itemBeforeTax + (itemBeforeTax * pajak);
        System.out.println("Harga Barang Setelah Pajak " +itemAfterTax);
    }
}
