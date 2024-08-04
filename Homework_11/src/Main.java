import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        //Creating 2 performers
        CircusPerformer performer1 = new CircusPerformer("Ivan P.", "juggler", 10);
        CircusPerformer performer2 = new CircusPerformer("Andrii R.", "acrobat", 15);
        CircusPerformer performer3 = new CircusPerformer("Mykyta D.", "clown", 4);
        CircusPerformer performer4 = new CircusPerformer("Annd F.", "Dancer", 8);
        //try to add performer with invalid experience
        //CircusPerformer performer5 = new CircusPerformer("dancer", "Jack Dany", -1);
        //Adding performers to the circle
        Circus<CircusPerformer> circus = new Circus<>();
        circus.addPerformer(performer1);
        circus.addPerformer(performer2);
        circus.addPerformer(performer3);
        circus.addPerformer(performer4);
        // circus.addPerformer(performer5);
        //Saving performers to the file
        circus.saveToFile("Performers.txt");
        //Removing performers to check further upload
        circus.removeAllPerformers();
        System.out.println(circus.listPerformers().isEmpty() ? "Performers list is cleared" : "Performers list is not empty!");
        //Upload performers from the file
        circus.loadFromFile("Performers.txt");
        System.out.println("Printing performers from the file:");
        for (Performer performer : circus.listPerformers()) {
            performer.printFullInfo();
        }

        System.out.println("##############################");
        //Check whether annotated method is running 3 times
        runAnnotatedMethods(performer1);

    }

    public static void runAnnotatedMethods(Object obj) {
        Class<?> objClass = obj.getClass();

        for (Method method : objClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                int times = annotation.times();

                for (int i = 0; i < times; i++) {
                    try {
                        method.invoke(obj);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
