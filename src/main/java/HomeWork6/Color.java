package HomeWork6;

import java.util.Random;
public enum Color {

    BLACK,
    WHITE,
    GREEN,
    RED,
    BLUE,
    BROWN,
    ORANGE,
    PINK,
    SILVER;

    public static Color generateRandomColor() {
        Color[] values = Color.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }
}