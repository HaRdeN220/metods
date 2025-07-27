import java.time.LocalDate;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkVersionDevice(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < 2015) {
            System.out.println("Устройство выпущено раньше 2015 года для него приложения не существует");
        } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static String deliveryDayInformation(int deliveryDistance) {
        int totalDays = 1;
        if (deliveryDistance > 100) {
            return "Доставка на ваш адрес невозможна";
        } else if (deliveryDistance > 60) {
            totalDays += 2;
        } else if (deliveryDistance > 20) {
            totalDays += 1;
        } else if (deliveryDistance < 0) {
            return "Вы некорректно ввели дистанцию до своего дома";
        }
        return "Потребуется дней: " + totalDays;
    }

    public static void main(String[] args) {
        System.out.println("Задача №1");
        checkLeapYear(2020);
        System.out.println("Задача №2");
        checkVersionDevice(0, 2015);
        System.out.println("Задача №3");
        System.out.println(deliveryDayInformation(76));
    }
}