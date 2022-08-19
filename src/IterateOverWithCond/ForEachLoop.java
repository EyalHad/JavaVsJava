package IterateOverWithCond;

public class ForEachLoop {

    public static void start() {

        Testing.init();

        for (int times = 0; times < Testing.SIZE; times++) {
            for (int i : Testing.arrInt) {
                if (i > 3800 && i % 3 == 0) {Testing.sumInt += i;}
            }
            for (long i : Testing.arrLong) {
                if (i > 3800 && i % 3 == 0) {Testing.sumLong += i;}
            }
            for (double i : Testing.arrDouble) {
                if (i > 3800 && i % 3 == 0) {Testing.sumDouble += i;}
            }

        }
    }
}
