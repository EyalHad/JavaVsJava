package CopyAnArray;

import java.util.Arrays;

public class CopyWithCopyOf {

    public static void start(){

        Testing.init();

        for (int times = 0; times < (Testing.SIZE); times++) {

            Testing.copyOfArrByte = Arrays.copyOf(Testing.arrByte, Testing.SIZE);

            Testing.copyOfArrShort = Arrays.copyOf(Testing.arrShort, Testing.SIZE);

            Testing.copyOfArrLong = Arrays.copyOf(Testing.arrLong, Testing.SIZE);

            Testing.copyOfArrInt = Arrays.copyOf(Testing.arrInt, Testing.SIZE);

            Testing.copyOfArrChar = Arrays.copyOf(Testing.arrChar, Testing.SIZE);

            Testing.copyOfArrDouble = Arrays.copyOf(Testing.arrDouble, Testing.SIZE);

            Testing.copyOfArrFloat = Arrays.copyOf(Testing.arrFloat, Testing.SIZE);

            Testing.copyOfArrBoolean = Arrays.copyOf(Testing.arrBoolean, Testing.SIZE);


        }
    }
}
