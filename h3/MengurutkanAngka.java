package com.prodemy.h3;

import java.util.Arrays;

public class MengurutkanAngka {
    public static void main(String[] args){
        int[] z = {3,2,6,4,1,8};

        Arrays.sort(z);
        System.out.println("Angka dari terkecil ke terbesar adalah ");
        System.out.println(Arrays.toString(z));
    }
}
