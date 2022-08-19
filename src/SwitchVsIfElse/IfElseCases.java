package SwitchVsIfElse;

public class IfElseCases {


    public static void start(String[] strings){

        for (int i = 0; i < Main.SIZE; i++) {

            if (strings[i].equals("0 0")){
                Main.val = 0;
            } else if (strings[i].equals("1 -1")) {
                Main.val = 1;
            } else if (strings[i].equals("44 -44")) {
                Main.val = 2;
            } else if (strings[i].equals("7777 -7777")) {
                Main.val = 3;
            } else if (strings[i].equals("8 -8")) {
                Main.val = 11;
            } else if (strings[i].equals("5 -5")) {
                Main.val = 22;
            } else if (strings[i].equals("432424 -432424")) {
                Main.val = 33;
            } else if (strings[i].equals("1111 -1111")) {
                Main.val = 111;
            } else if (strings[i].equals("12012 -12012")) {
                Main.val = 222;
            }
        }
    }
}
