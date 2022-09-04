package com.prodemy.h3;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point ini isinya adalah " +
                "x=" + x +
                ", y=" + y;
    }
}
