package CopyAnArray;

public class CopyByForLoop {

    public static void start(){

        Testing.init();

        for (int times = 0; times < (Testing.SIZE); times++) {

            for (int i = 0; i < Testing.SIZE; i++) {
                Testing.copyOfArrByte[i] = Testing.arrByte[i];
            }

            for (int i = 0; i < Testing.SIZE; i++) {
                Testing.copyOfArrShort[i] = Testing.arrShort[i];
            }


            for (int i = 0; i < Testing.SIZE; i++) {
                Testing.copyOfArrLong[i] = Testing.arrLong[i];
            }


            for (int i = 0; i < Testing.SIZE; i++) {
                Testing.copyOfArrInt[i] = Testing.arrInt[i];
            }


            for (int i = 0; i < Testing.SIZE; i++) {
                Testing.copyOfArrChar[i] = Testing.arrChar[i];
            }


            for (int i = 0; i < Testing.SIZE; i++) {
                Testing.copyOfArrDouble[i] = Testing.arrDouble[i];
            }


            for (int i = 0; i < Testing.SIZE; i++) {
                Testing.copyOfArrFloat[i] = Testing.arrFloat[i];
            }


            for (int i = 0; i < Testing.SIZE; i++) {
                Testing.copyOfArrBoolean[i] = Testing.arrBoolean[i];
            }

        }
    }
}

