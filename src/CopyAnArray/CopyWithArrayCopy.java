package CopyAnArray;

public class CopyWithArrayCopy {

    public static void start(){

        Testing.init();

        for (int times = 0; times < (Testing.SIZE); times++) {

            System.arraycopy(Testing.arrByte,0, Testing.copyOfArrByte,0, Testing.SIZE);
            System.arraycopy(Testing.arrShort,0, Testing.copyOfArrShort,0, Testing.SIZE);
            System.arraycopy(Testing.arrLong,0, Testing.copyOfArrLong,0, Testing.SIZE);
            System.arraycopy(Testing.arrInt,0, Testing.copyOfArrInt,0, Testing.SIZE);
            System.arraycopy(Testing.arrChar,0, Testing.copyOfArrChar,0, Testing.SIZE);
            System.arraycopy(Testing.arrDouble,0, Testing.copyOfArrDouble,0, Testing.SIZE);
            System.arraycopy(Testing.arrFloat,0, Testing.copyOfArrFloat,0, Testing.SIZE);
            System.arraycopy(Testing.arrBoolean,0, Testing.copyOfArrBoolean,0, Testing.SIZE);



        }
    }
}
