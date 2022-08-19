package IterateOverWithCond;


public class Testing {

    public final static int SIZE = 75000;

    public static int sumInt;
    public static long sumLong;
    public static double sumDouble;

    // ---int type---
    public static int[] arrInt = new int[SIZE];

    // ---long type---
    public static long[] arrLong = new long[SIZE];

    // ---double type---
    public static double[] arrDouble = new double[SIZE];


    public static void init(){


        sumInt = 0;
        sumLong = 0;
        sumDouble = 0;


        for (int i = 0; i < SIZE; i++) {arrLong[i] = i;}
        for (int i = 0; i < SIZE; i++) {arrInt[i] = i;}
        for (int i = 0; i < SIZE; i++) {arrDouble[i] = 0.2;}


    }




}
