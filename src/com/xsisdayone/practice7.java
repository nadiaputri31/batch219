package com.xsisdayone;

import java.util.Scanner;

public class practice7 {
    static final double pajak =.15;
    public static void main(String[] args) {
            double itemBeforeDiscount, discount, itemAfterDiscount;
            Scanner scan = new Scanner(System.in);
            System.out.print("Harga Item Barang : ");
            itemBeforeDiscount = scan.nextDouble();
             System.out.print("Diskon % :");
             discount = scan.nextDouble();
            itemAfterDiscount= itemBeforeDiscount - (itemBeforeDiscount * discount/100);
            System.out.println("Harga Barang Setelah Pajak " +itemAfterDiscount);
    }
}
