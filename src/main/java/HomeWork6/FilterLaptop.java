package HomeWork6;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class FilterLaptop {
    public static Set<Laptop> filterColor(Set<Laptop> lp,String color) {
        Set<Laptop> filterLaptop = new HashSet<>();
        for (Laptop latp:lp) {
            if (latp.getColor().toString().equalsIgnoreCase(color)) {
                filterLaptop.add(latp);
            }
        }
        return filterLaptop;
    }
    public static Set<Laptop> filterManufacturer(Set<Laptop> lp,String manufacturer) {
        Set<Laptop> filterLaptop = new HashSet<>();
        for (Laptop laptp:lp) {
            if (laptp.getManufacturer().toString().equalsIgnoreCase(manufacturer)) {
                filterLaptop.add(laptp);
            }
        }
        return filterLaptop;
    }
    public static Set<Laptop> fullLaptop(Set<Laptop> lp) {
        Set<Laptop> fullLaptop = new HashSet<>();
        for (Laptop laptp:lp) {
            fullLaptop.add(laptp);
        }
        return fullLaptop;
    }

}