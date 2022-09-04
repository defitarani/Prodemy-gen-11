package com.prodemy.h3;

import com.prodemy.util.DateUtil;

public class SortingArray {
    public static void main(String[] args){
        int[] angka = new int[] {23, 25, 4, 12, 21};
        System.out.print("Angka acak: ");

        for (int a=0; a < angka.length; a++){
            System.out.print(angka[a] + " ");
        }
        int temp;
        for (int a=0; a < angka.length; a++) {
            for (int b=a; b< angka.length; b++) {
                if(angka[a] > angka[b]) {
                    temp = angka[a];
                    angka[a] = angka[b];
                    angka[b] = temp;
                }
            }
        }
        System.out.println("");
        System.out.print("Angka setelah diurutkan: ");
        for (int x: angka){
            System.out.print(x + " ");
        }
        System.out.println("");
        System.out.println(DateUtil.getInfoHari());

    }
}
