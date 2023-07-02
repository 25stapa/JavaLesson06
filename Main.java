package Lesson06;
/**
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
 * Реализовать в java.
 * Создать множество ноутбуков (ArrayList).
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 * Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
 * Выводить только те ноутбуки, что соответствуют условию
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Множество `ArrayList` ноутбуков и реализуем фильтрацию
        List<Laptop> laptops = new ArrayList<>();

        // Добавление ноутбуков в список
        laptops.add(new Laptop("Asus", "M1702QA-AU083", 16, 17.3, "Blue", "Windows", 97_191.00));
        laptops.add(new Laptop("Lenovo", "IdeaPad 3 14ADA05", 8, 14.0, "Blue", "Windows 11", 39_999.00));
        laptops.add(new Laptop("Apple", "MacBook Pro", 16, 14.0, "Silver", "macOS", 195_000.00));
        laptops.add(new Laptop("MSI", "M17653A-AW433", 8, 14.0, "Black", "Windows", 54_191.00));
        laptops.add(new Laptop("Huawei", "D15-i5-1155G7", 16, 15.6, "Black", "Windows 11", 59_999.00));
        laptops.add(new Laptop("Apple", "MacBook Air 13 M1", 8, 13.0, "Space Gray", "macOS", 86_799.00));
        laptops.add(new Laptop("Haier", "i1510SD", 8, 15.6, "Black", "Dos", 34_999.00));
        laptops.add(new Laptop("Honor", "MagicBook X 15", 8, 15.6, "Space Grey", "Windows 11", 51_999.00));
        laptops.add(new Laptop("Acer", "AN515-57 NH.QELER.00C", 16, 15.6, "Black", "Dos", 51_999.00));
        laptops.add(new Laptop("GIGABYTE", "KD-52EE123SD", 16, 15.6, "Black", "Dos", 84_999.00));

        // Ввод условий от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the minimum RAM size(8Gb,16Gb): ");
        int minRamSize = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера после ввода числа

        System.out.print("Enter laptop manufacturer\n(Asus,Lenovo,Apple,MSI\nHuawei,Haier,Honor,Acer,Gigabyte): ");
        String brandLaptop = scanner.nextLine();

        System.out.print("Enter the desired color of the laptop: ");
        String desiredColor = scanner.nextLine();

        // Фильтрация и вывод ноутбуков, соответствующих условиям
        for (Laptop laptop : laptops) {
            if (laptop.getRamSize() >= minRamSize && laptop.getBrand().equalsIgnoreCase(brandLaptop)
                    && laptop.getColor().equalsIgnoreCase(desiredColor)) {
                laptop.displayInfo();
            }
        }
    }

}



