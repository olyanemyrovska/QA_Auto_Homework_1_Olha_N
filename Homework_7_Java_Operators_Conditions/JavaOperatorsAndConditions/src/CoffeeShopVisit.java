import java.util.Scanner;

public class CoffeeShopVisit {

    public static void main(String[] args) {
        int espressoPrice = 3;
        int lattePrice = 4;
        int cappuccinoPrice = 5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість еспресо: ");
        int espresso = scanner.nextInt();
        System.out.println("Введіть кількість лате: ");
        int latte = scanner.nextInt();
        System.out.println("Введіть кількість капучіно: ");
        int cappuccino = scanner.nextInt();

        if (espresso < 0 || latte < 0 || cappuccino < 0) {
            System.out.println("Кількість напоїв не може бути від'ємною.");
        } else if (espresso == 0 && latte == 0 && cappuccino == 0) {
            System.out.println("Виберіть хоча б один напій.");
        } else {
            int totalPrice = espresso * espressoPrice + latte * lattePrice + cappuccino * cappuccinoPrice;
            System.out.println("Загальна вартість напоїв: " + totalPrice + " USD.");
        }
    }
}
