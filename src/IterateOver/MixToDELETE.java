package IterateOver;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MixToDELETE {

    public static void main(String[] args) {

        Integer sum = 0;
        final int len = 100000;
        Integer[] arr = new Integer[len];
        for (int i = 0; i < len; i++) {
            arr[i] = i;
        }

        // for loop
        long startForLoop = System.currentTimeMillis();
        for (int i = 0; i < len; i++) {
            sum += arr[i];
        }
        long endForLoop = System.currentTimeMillis();
        System.out.println("total time for loop: " + ((double)(endForLoop-startForLoop))/1000);

        // foreach loop
        sum = 0;
        long startForEachLoop = System.currentTimeMillis();
        for (int x : arr) {
            sum += x;
        }
        long endForEachLoop = System.currentTimeMillis();
        System.out.println("total time for each loop: " + ((double)(endForEachLoop-startForEachLoop))/1000);

        // java streams
        List<Integer> integers = Arrays.asList(arr);

        // reduce1
        long startReduce1 = System.currentTimeMillis();
        sum = integers.stream().reduce(0, (a, b) -> a + b);
        long endReduce1 = System.currentTimeMillis();
        System.out.println("total time streams reduce1: " + ((double)(endReduce1-startReduce1))/1000);

        // reduce2
        long startReduce2 = System.currentTimeMillis();
        sum = integers.stream().reduce(0, Integer::sum);
        long endReduce2 = System.currentTimeMillis();
        System.out.println("total time streams reduce2: " + ((double)(endReduce2-startReduce2))/1000);

        // collect
        long startCollect = System.currentTimeMillis();
        sum = integers.stream().collect(Collectors.summingInt(Integer::intValue));
        long endCollect = System.currentTimeMillis();
        System.out.println("total time streams collect: " + ((double)(endCollect-startCollect))/1000);

        // intStream
        long startIntStream = System.currentTimeMillis();
        sum = integers.stream().mapToInt(Integer::intValue).sum();
        long endIntStream = System.currentTimeMillis();
        System.out.println("total time streams intStream: " + ((double)(endIntStream-startIntStream))/1000);

    }
}
