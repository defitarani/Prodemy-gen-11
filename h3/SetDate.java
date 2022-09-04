package com.prodemy.h3;

import java.time.LocalDateTime;

public class SetDate {
    static private String[] hari = new String[] {"Minggu","Senin","Selasa","Rabu","Kamis","Jumat","Sabtu" };
    static private String[] bulan = new String[] {"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus"
            ,"September","Oktober","November","Desember"};
    public static int getCount(){
        return 10;
    }

    public static void main(String[] args) {
        int i = 0;
        int count = 0;
        do {
            if (i % 2 != 0) {
                count++;
            }
            i++;
        } while (count < getCount());
        LocalDateTime hariIni = LocalDateTime.now();
        String infoHari = hari[hariIni.getDayOfWeek().getValue()] + ", "
                + hariIni.getDayOfMonth() + " "
                + bulan[hariIni.getMonthValue() - 1] + " "
                + hariIni.getYear();
        System.out.println(infoHari);
    }
}
