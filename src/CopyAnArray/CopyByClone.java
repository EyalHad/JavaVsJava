package CopyAnArray;

public class CopyByClone {

    public static void start() {

        Testing.init();

        for (int times = 0; times < (Testing.SIZE); times++) {

            Testing.copyOfArrByte = Testing.arrByte.clone();

            Testing.copyOfArrShort = Testing.arrShort.clone();

            Testing.copyOfArrLong = Testing.arrLong.clone();

            Testing.copyOfArrInt = Testing.arrInt.clone();

            Testing.copyOfArrChar = Testing.arrChar.clone();

            Testing.copyOfArrDouble = Testing.arrDouble.clone();

            Testing.copyOfArrFloat = Testing.arrFloat.clone();

            Testing.copyOfArrBoolean = Testing.arrBoolean.clone();


        }
    }

}
