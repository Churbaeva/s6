import HomeWork6.Color;
import HomeWork6.FilterLaptop;
import HomeWork6.Laptop;
import HomeWork6.Manufacturer;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Laptop> laptops = new HashSet<>();
        System.out.println("Сегодня завоз новой техники. Выберите количество новых товаров");
        int pullLaptop = in.nextInt();
        for (int i = 0; i < pullLaptop; i++) {
            laptops.add(new Laptop(Color.generateRandomColor(), Manufacturer.generateRandomManufacture()));
        }
        System.out.println(laptops);
        System.out.println("Выберите пункт:");
        System.out.println("1 - Вывод всего каталога");
        System.out.println("2 - Фильтрация по цветам");
        System.out.println("3 - Фильтрация по производителю");
        int parametrFilter = in.nextInt();
        in.nextLine();
        switch (parametrFilter) {
            case 1:
                FilterLaptop.fullLaptop(laptops);
                break;
            case 2:
                System.out.println("Введите цвет для фильтрации");
                String parametrColor = in.nextLine();
                laptops = FilterLaptop.filterColor(laptops, parametrColor);
                break;
            case 3:
                System.out.println("Введите производителя фильтрации");
                String parametrManufactures = in.nextLine();
                laptops = FilterLaptop.filterManufacturer(laptops, parametrManufactures);
                break;
            default:
                System.out.println("Такого пунка нет");
                break;
        }
        System.out.println("Результаты фильтрации:");
        if (laptops.isEmpty()) {
            System.out.println("Не найдено");
        } else {
            for (Laptop lp : laptops) {
                System.out.println(lp);
            }
        }
    }
}