import java.util.Scanner;

public class ChoiceOfDish {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter desired type of dish: \n" +
                "    appetizer = 1;\n" +
                "    mainDish = 2;\n" +
                "    dessert = 3;\n" +
                "    drink = 4; ");

        int dishType = scan.nextInt();

        String result;

        switch (dishType) {
            case 1:
                result = "Deruny";
                break;
            case 2:
                result = "Chicken Kyiv";
                break;
            case 3:
                result = "Kyiv cake";
                break;
            case 4:
                result = "Uzvar";
                break;
            default:
                result = "Please enter valid number from 1 to 4. Anyway, water is free:)";
                break;
        }
        System.out.println(result);
    }
}
