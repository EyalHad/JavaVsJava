package CopyAnArray;

public class CopyWithForEach {


    public static void start(){

        Testing.init();
        int index = 0;
        for (int times = 0; times < (Testing.SIZE); times++) {

            index = 0;
            for (byte i : Testing.arrByte) {
                Testing.copyOfArrByte[index++] = i;
            }

            index = 0;
            for (short i : Testing.arrShort) {
                Testing.copyOfArrShort[index++] = i;
            }

            index = 0;
            for (long i : Testing.arrLong) {
                Testing.copyOfArrLong[index++] = i;
            }

            index = 0;
            for (int i : Testing.arrInt) {
                Testing.copyOfArrInt[index++] = i;
            }

            index = 0;
            for (char i : Testing.arrChar) {
                Testing.copyOfArrChar[index++] = i;
            }

            index = 0;
            for (double i : Testing.arrDouble) {
                Testing.copyOfArrDouble[index++] = i;
            }

            index = 0;
            for (float i : Testing.arrFloat) {
                Testing.copyOfArrFloat[index++] = i;
            }

            index = 0;
            for (boolean i : Testing.arrBoolean) {
                Testing.copyOfArrBoolean[index++] = i;
            }

        }
    }
}
