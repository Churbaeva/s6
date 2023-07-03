package HomeWork6;

import java.util.Random;

public enum Manufacturer {
    ACER,
    APPLE,
    ASUS,
    HONOR,
    HUAWEI,
    LENOVO,
    SAMSUNG,
    MSI,
    HP;

    public static Manufacturer generateRandomManufacture() {
        Manufacturer[] values = Manufacturer.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }
}