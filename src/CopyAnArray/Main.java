package CopyAnArray;


public class Main {

    public static void main(String[] args) {

//        long start = System.currentTimeMillis();
//
//        CopyByForLoop.start();
//
//        long end = System.currentTimeMillis();
//
//        System.out.println("CopyAnArray.CopyByForLoop -> " + ((double) (end - start)) / 1000);
//
//        long start = System.currentTimeMillis();
//
//        CopyByClone.start();
//
//        long end = System.currentTimeMillis();
//
//        System.out.println("CopyAnArray.CopyByClone -> " + ((double) (end - start)) / 1000);


//        long start = System.currentTimeMillis();
//
//        CopyWithCopyOf.start();
//
//        long end = System.currentTimeMillis();
//
//        System.out.println("CopyAnArray.CopyWithCopyOf -> " + ((double) (end - start)) / 1000);


//        long start = System.currentTimeMillis();
//
//        CopyWithArrayCopy.start();
//
//        long end = System.currentTimeMillis();
//
//        System.out.println("CopyAnArray.CopyWithArrayCopy -> " + ((double) (end - start)) / 1000);

        long start = System.currentTimeMillis();

        CopyWithForEach.start();

        long end = System.currentTimeMillis();

        System.out.println("CopyAnArray.CopyWithForEach -> " + ((double) (end - start)) / 1000);
    }
}
