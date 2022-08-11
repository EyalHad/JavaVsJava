package IterateOver;



public class Main {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        ForEachLoop.start();
        long end = System.currentTimeMillis();
        System.out.println("ForEachLoop -> " + ((double) (end - start)) / 1000);

        start = System.currentTimeMillis();
        ForLoop.start();
        end = System.currentTimeMillis();
        System.out.println("ForLoop -> " + ((double) (end - start)) / 1000);


        start = System.currentTimeMillis();
        UsingStream.start();
        end = System.currentTimeMillis();
        System.out.println("UsingStream -> " + ((double) (end - start)) / 1000);



    }
}
