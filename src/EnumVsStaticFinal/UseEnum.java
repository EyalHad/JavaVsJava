package EnumVsStaticFinal;

import java.util.ArrayList;
import java.util.List;

public class UseEnum {

    enum CardinalDirection{
        SOUTH,
        EAST,
        WEST,
        NORTH
    }
    enum Direction{
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
    enum Numbers{
        ZERO,
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN
    }

    public static void start(){
        List<Direction> directions = new ArrayList<>();
        List<UseEnum.CardinalDirection> cardinalDirections = new ArrayList<>();
        List<UseEnum.Numbers> numbers = new ArrayList<>();
        for (int i = 0; i < Main.SIZE; i++) {

            directions.add(UseEnum.Direction.DOWN);
            directions.add(UseEnum.Direction.LEFT);
            directions.add(UseEnum.Direction.UP);
            directions.add(UseEnum.Direction.RIGHT);

            cardinalDirections.add(UseEnum.CardinalDirection.EAST);
            cardinalDirections.add(UseEnum.CardinalDirection.WEST);
            cardinalDirections.add(UseEnum.CardinalDirection.NORTH);
            cardinalDirections.add(UseEnum.CardinalDirection.SOUTH);

            numbers.add(UseEnum.Numbers.ZERO);
            numbers.add(UseEnum.Numbers.ONE);
            numbers.add(UseEnum.Numbers.TWO);
            numbers.add(UseEnum.Numbers.THREE);
            numbers.add(UseEnum.Numbers.FOUR);
            numbers.add(UseEnum.Numbers.FIVE);
            numbers.add(UseEnum.Numbers.SIX);
            numbers.add(UseEnum.Numbers.SEVEN);
            numbers.add(UseEnum.Numbers.EIGHT);
            numbers.add(UseEnum.Numbers.NINE);
            numbers.add(UseEnum.Numbers.TEN);

        }
        for (int i = 0; i < Main.SIZE; i++) {
            UseEnum.Direction direction = directions.get(i);
            UseEnum.CardinalDirection cardinalDirection = cardinalDirections.get(i);
            UseEnum.Numbers number = numbers.get(i);
            if (direction.equals(UseEnum.Direction.DOWN)){
                Main.val = 4;
            } else if (cardinalDirection.equals(UseEnum.CardinalDirection.WEST)) {
                Main.val = 6;
            } else if (number.equals(UseEnum.Numbers.EIGHT)) {
                Main.val = 8;
            }
        }


    }
}
