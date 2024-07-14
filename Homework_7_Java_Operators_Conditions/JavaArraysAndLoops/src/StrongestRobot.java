public class StrongestRobot {
    public static void main(String[] args) {
        int[] weights = {300, 450, 200, 500, 350, 900, 0};
       // int[] weights = {12};

        if (weights.length == 0) {
            System.out.println("There is no robots in current category");
        } else if (weights.length == 1) {
            System.out.println("There is only one robot in this category. Please add more than one to find the strongest one.");
        } else {
            int strongestRobot = -1;
            int maxWeight = 0;//assuming that min weight is 0

            for (int i = 0; i < weights.length; i++) {
                if (weights[i] > maxWeight) {
                    maxWeight = weights[i];
                    strongestRobot = i;
                }
            }

            System.out.println("Strongest robot number is: " + strongestRobot + " " +
                    "and he (it?) lifted: " + weights[strongestRobot] + " kg.");
        }
    }
}