import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Circus<T> {
    private List<T> performers;

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
                CircusPerformer currentPerformer = (CircusPerformer) performer;
                bw.write(currentPerformer.getName() + "," + currentPerformer.getPerformanceType() + "," + currentPerformer.getExperience() + "\n");
            }

        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while ((line = br.readLine())!= null) {
                System.out.println(line + "\n");
                if (!line.isEmpty()) {
                    String[] fields = line.split(",");
                    if (fields.length == 3)
                        try {
                            CircusPerformer performer = new CircusPerformer(fields[0], fields[1], Integer.parseInt(fields[2]));
                            performers.add((T) performer);
                        } catch (NumberFormatException e) {
                            System.out.println("Third parameter in a file line is not an integer" + e.getMessage());
                        }
                }
            }

        } catch (IOException | ClassCastException e) {
            System.out.println("Error loading from file: " + e.getMessage());
        }
    }
}
