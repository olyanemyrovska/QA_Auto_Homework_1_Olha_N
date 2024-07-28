import java.io.Serializable;

public class CircusPerformer implements Serializable {
    private String name;
    private String performanceType;
    private int experience;

    public CircusPerformer(String performanceType, String name, int experience) {
        this.performanceType = performanceType;
        this.name = name;
        try {
            if (experience < 0 || experience > 50) {
                throw new InvalidExperienceException("Age should be between 0 and 50");
            }
            this.experience = experience;
        } catch (InvalidExperienceException e) {
            System.out.println("Invalid value provided: " + e.getMessage());
        }
    }


    @RunImmediately(times = 3)
    public void printFullInfo() {
        System.out.println("CircusPerformer: " +
                "name='" + name + '\'' +
                ", performanceType='" + performanceType + '\'' +
                ", experience=" + experience +
                '}');
    }
}
