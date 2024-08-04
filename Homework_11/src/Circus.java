import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Circus<T extends Performer> {
    private final List<T> performers;

    public Circus() {
        this.performers = new ArrayList<>();
    }

    public void addPerformer(T performer) {
        performers.add(performer);
    }

    public void removePerformer(T performer) {
        performers.remove(performer);
    }

    public void removeAllPerformers() {
        performers.clear();
    }

    public List<T> listPerformers() {
        return performers;
    }

    public void saveToFile(String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (T performer : performers) {
                if (performer instanceof CircusPerformer) {
                    CircusPerformer currentPerformer = (CircusPerformer) performer;
                    bw.write(currentPerformer.getName() + "," + currentPerformer.getPerformanceType() + "," + currentPerformer.getExperience() + "\n");
                } else {
                    throw new IllegalArgumentException("Performer must be of type CircusPerformer to save to file");
                }
            }
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length == 3) {
                    try {
                        CircusPerformer performer = new CircusPerformer(fields[0], fields[1], Integer.parseInt(fields[2]));
                        performers.add((T) performer);
                    } catch (NumberFormatException e) {
                        System.out.println("Third parameter in a file line is not an integer: " + e.getMessage());
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
