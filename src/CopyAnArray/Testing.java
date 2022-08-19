package CopyAnArray;

public class Testing {

    public final static int SIZE = 100_000;

    // ---byte type---
    public static byte[] arrByte = new byte[SIZE];
    public static byte[] copyOfArrByte = new byte[SIZE];

    // ---short type---
    public static short[] arrShort = new short[SIZE];
    public static short[] copyOfArrShort = new short[SIZE];

    // ---int type---
    public static int[] arrInt = new int[SIZE];
    public static int[] copyOfArrInt = new int[SIZE];

    // ---long type---
    public static long[] arrLong = new long[SIZE];
    public static long[] copyOfArrLong = new long[SIZE];

    // ---char type---
    public static char[] arrChar = new char[SIZE];
    public static char[] copyOfArrChar = new char[SIZE];

    // ---double type---
    public static double[] arrDouble = new double[SIZE];
    public static double[] copyOfArrDouble = new double[SIZE];

    // ---float type---
    public static float[] arrFloat = new float[SIZE];
    public static float[] copyOfArrFloat = new float[SIZE];

    // ---boolean type---
    public static boolean[] arrBoolean = new boolean[SIZE];
    public static boolean[] copyOfArrBoolean = new boolean[SIZE];

    public static void init(){

        long start = System.currentTimeMillis();
        System.out.println("Preparations has been started");

        for (int i = 0; i < SIZE; i++) {arrLong[i] = i+50000;}
        for (int i = 0; i < SIZE; i++) {arrInt[i] = i;}

        for (int i = 0; i < SIZE; i++) {arrShort[i] = 2;}
        for (int i = 0; i < SIZE; i++) {arrByte[i] = 1;}

        for (int i = 0; i < SIZE; i++) {arrDouble[i] = 0.2;}
        for (int i = 0; i < SIZE; i++) {arrFloat[i] = 10;}

        for (int i = 0; i < SIZE; i++) {arrChar[i] = 'a';}

        for (int i = 0; i < SIZE/2; i++) {arrBoolean[i] = true;}
        for (int i = 0; i < SIZE/2; i++) {arrBoolean[i] = false;}

        long end = System.currentTimeMillis();
        System.out.println("Preparations has been done :) "+ ((double)(end-start))/1000);

    }




}
