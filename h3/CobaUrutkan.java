package com.prodemy.h3;

import java.util.Arrays;

public class CobaUrutkan{
    public static void main(String[] args){
        int[] angka = new int[] {23, 25, 4, 12, 21};

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

        System.out.print(Arrays.toString(angka));
    }
}
