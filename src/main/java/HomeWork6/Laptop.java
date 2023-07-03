package HomeWork6;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Laptop {
    Color color;
    Manufacturer manufacturer;
    public Laptop(Color color,Manufacturer manufacturer) {
        this.color = color;
        this.manufacturer = manufacturer;
    }

    public Color getColor() {
        return color;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}