package SwitchVsIfElse;

public class SwitchEnhanced {

    public static void start(String[] strings){

        for (int i = 0; i < Main.SIZE; i++) {

            switch (strings[i]) {
                case "0 0" -> Main.val = 0;
                case "1 -1" -> Main.val = 1;
                case "44 -44" -> Main.val = 2;
                case "7777 -7777" -> Main.val = 3;
                case "8 -8" -> Main.val = 11;
                case "5 -5" -> Main.val = 22;
                case "432424 -432424" -> Main.val = 33;
                case "1111 -1111" -> Main.val = 111;
                case "12012 -12012" -> Main.val = 222;
            }
        }
    }
}
