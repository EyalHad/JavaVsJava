package SwitchVsIfElse;

public class SwitchCases {

    public static void start(String[] strings){

        for (int i = 0; i < Main.SIZE; i++) {

            switch (strings[i]) {
                case "0 0" :
                    Main.val = 0;
                    break;
                case "1 -1" :
                    Main.val = 1;
                    break;
                case "44 -44" :
                    Main.val = 2;
                    break;
                case "7777 -7777" :
                    Main.val = 3;
                    break;
                case "8 -8" :
                    Main.val = 11;
                    break;
                case "5 -5" :
                    Main.val = 22;
                    break;
                case "432424 -432424" :
                    Main.val = 33;
                    break;
                case "1111 -1111" :
                    Main.val = 111;
                    break;
                case "12012 -12012" :
                    Main.val = 222;
            }
        }
    }
}
