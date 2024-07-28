import java.io.*;
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
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(performers);
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            performers = (List<T>) ois.readObject();
        } catch (IOException | ClassNotFoundException |ClassCastException e) {
            System.out.println("Error loading from file: " + e.getMessage());
        }
    }
}
