package com.prodemy.h3;

import com.prodemy.util.DateUtil;

import java.util.Scanner;

public class BilanganGenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int hasil = sc.nextInt();

        int i=1;
        int count=0;
        do {
            if (i % 2 == 0) {
                System.out.print(i);
                count++;
                if (count < hasil) {
                    System.out.print(",");
                }
            }
            i++;
        } while (count < hasil);
    }
}
