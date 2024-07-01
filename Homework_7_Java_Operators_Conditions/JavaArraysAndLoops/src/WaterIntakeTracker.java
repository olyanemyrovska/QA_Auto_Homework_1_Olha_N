public class WaterIntakeTracker {

    public static void main(String[] args) {
        int[] waterIntake = {3, 1, 4, 2, 0, 5, 2};

        int i = 0;
        int sum = 0;
        while (waterIntake.length > i) {
            if (waterIntake[i] >= 2) {
                sum += waterIntake[i];
            }
            i++;
        }
        System.out.println("You have taken " + sum + " cups of water during this week.");

//Option 2 with 'continue'
        int j = 0;
        int sum2 = 0;
        while (waterIntake.length > j) {
            if(waterIntake[j] < 2){
                j++;
                continue;
            }
            sum2 += waterIntake[j];
            j++;
        }
        System.out.println("You have taken " + sum2 + " cups of water during this week.");
    }
}
