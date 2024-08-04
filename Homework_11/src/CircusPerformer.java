import java.io.Serializable;

public class CircusPerformer implements Performer {
    private String name;
    private String performanceType;
    private int experience;

    public CircusPerformer(String name, String perfType, int experience) {
        this.name = name;
        this.performanceType = perfType;
        try {
            if (experience <= 0 || experience > 50) {
                throw new InvalidExperienceException("Age should be between 0 and 50");
            }
            this.experience = experience;
        } catch (InvalidExperienceException e) {
            System.err.println("Invalid value provided: " + e.getMessage());
        }
    }

    public String getName() {
        return this.name;
    }

    public String getPerformanceType() {
        return this.performanceType;
    }

    public int getExperience() {
        return this.experience;
    }

    @RunImmediately(times = 3)
    public void printFullInfo() {
        System.out.println("CircusPerformer: " +
                "name='" + this.name + '\'' +
                ", performanceType='" + this.performanceType + '\'' +
                ", experience=" + this.experience +
                '}');
    }

    @Override
    public void act() {
        System.out.println("Performer is acting!");
    }
}
