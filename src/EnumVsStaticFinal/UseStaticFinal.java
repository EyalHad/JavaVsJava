package EnumVsStaticFinal;

import java.util.ArrayList;
import java.util.List;

public class UseStaticFinal {

    //CardinalDirection
    public static final String SOUTH = "SOUTH";
    public static final String EAST = "EAST";
    public static final String WEST = "WEST";
    public static final String NORTH = "NORTH";

    //Direction
    public static final String UP = "UP";
    public static final String DOWN = "DOWN";
    public static final String LEFT = "LEFT";
    public static final String RIGHT = "RIGHT";

    //Numbers
    public static final String ZERO = "ZERO";
    public static final String ONE = "ONE";
    public static final String TWO = "TWO";
    public static final String THREE = "THREE";
    public static final String FOUR = "FOUR";
    public static final String FIVE = "FIVE";
    public static final String SIX = "SIX";
    public static final String SEVEN = "SEVEN";
    public static final String EIGHT = "EIGHT";
    public static final String NINE = "NINE";
    public static final String TEN = "TEN";

    public static void start(){
        List<String> staticDirections = new ArrayList<>();
        List<String> staticCardinalDirections = new ArrayList<>();
        List<String> staticNumbers = new ArrayList<>();
        for (int i = 0; i < Main.SIZE; i++) {

            staticDirections.add(UseStaticFinal.DOWN);
            staticDirections.add(UseStaticFinal.LEFT);
            staticDirections.add(UseStaticFinal.UP);
            staticDirections.add(UseStaticFinal.RIGHT);

            staticCardinalDirections.add(UseStaticFinal.EAST);
            staticCardinalDirections.add(UseStaticFinal.WEST);
            staticCardinalDirections.add(UseStaticFinal.NORTH);
            staticCardinalDirections.add(UseStaticFinal.SOUTH);

            staticNumbers.add(UseStaticFinal.ZERO);
            staticNumbers.add(UseStaticFinal.ONE);
            staticNumbers.add(UseStaticFinal.TWO);
            staticNumbers.add(UseStaticFinal.THREE);
            staticNumbers.add(UseStaticFinal.FOUR);
            staticNumbers.add(UseStaticFinal.FIVE);
            staticNumbers.add(UseStaticFinal.SIX);
            staticNumbers.add(UseStaticFinal.SEVEN);
            staticNumbers.add(UseStaticFinal.EIGHT);
            staticNumbers.add(UseStaticFinal.NINE);
            staticNumbers.add(UseStaticFinal.TEN);

        }

        for (int i = 0; i < Main.SIZE; i++) {
            String direction = staticDirections.get(i);
            String cardinalDirection = staticCardinalDirections.get(i);
            String number = staticNumbers.get(i);
            if (direction.equals(UseStaticFinal.DOWN)){
                Main.val =  1;
            } else if (cardinalDirection.equals(UseStaticFinal.WEST)) {
                Main.val =  2;
            } else if (number.equals(UseStaticFinal.EIGHT)) {
                Main.val =  3;
            }
        }
    }


}
