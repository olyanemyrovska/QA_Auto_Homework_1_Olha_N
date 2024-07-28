import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Circus<T> {
    private List<T> artists;

    public Circus() {
        this.artists = new ArrayList<>();
    }

    public void addPerformer(T performer) {
        artists.add(performer);
    }

    public void removePerformer(T performer) {
        artists.remove(performer);
    }
    public void removeAllPerformers() {
        artists.clear();
    }

    public List<T> listPerformers() {
        return artists;
    }

    public void saveToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(artists);
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            artists = (List<T>) ois.readObject();
        } catch (IOException | ClassNotFoundException |ClassCastException e) {
            System.out.println("Error loading from file: " + e.getMessage());
        }
    }
}
