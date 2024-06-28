import java.util.Scanner;

public class MagicalApple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть поточну годину(0-23):");
        int hour = scan.nextInt();

        if (hour >= 0 && hour < 24) {
            int energyAmount = findEnergyAmount(hour);
            System.out.println("Вітаю! Ви отримали " + energyAmount + " одиниць енергії!");
        } else {
            System.out.println("Будь ласка, введіть валідний час в 24-годинному форматі.");
        }
    }

    public static int findEnergyAmount(int hour) {
        if (hour >= 6 && hour < 12) {
            return 10;
        } else if (hour >= 12 && hour < 18) {
            return 20;
        } else if (hour >= 18 && hour < 24) {
            return 30;
        } else if (hour >= 0 && hour < 6) {
            return 6;
        } else {
            return 0;
        }
    }
}
