package com.prodemy.h3;

import com.prodemy.util.DateUtil;

public class BilanganGanjil {
    public static int getCount(){return 10;
    }

    public static void main(String[] args) {
        int i=0;
        int n=9;
        int count=0;
        do {
            if (i % 2 !=0) {
                System.out.println(i);
                count++;
            }
            i++;
        } while (count < getCount());
        System.out.println(DateUtil.getInfoHari());
    }
}
