import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
//Creating 2 performers
        CircusPerformer performer1 = new CircusPerformer("acrobat", "Ivan Petrenko", 10);
        CircusPerformer performer2 = new CircusPerformer("clown", "Denys Darenko", 1);
        CircusPerformer performer3 = new CircusPerformer("juggler", "Peter Petrov", 4);
        CircusPerformer performer4 = new CircusPerformer("dancer", "Nataly Oreo", 8);
        //Adding performers to the circle
        Circus<CircusPerformer> circus = new Circus();
        circus.addPerformer(performer1);
        circus.addPerformer(performer2);
        circus.addPerformer(performer3);
        circus.addPerformer(performer4);
        //Saving performers to the file
        circus.saveToFile("CircusPerformersFile");
        //Removing performers to check further upload
        circus.removeAllPerformers();
        System.out.println(circus.listPerformers().isEmpty());
        //Upload performers from the file
        circus.loadFromFile("CircusPerformersFile");
        for (CircusPerformer performer : circus.listPerformers()) {
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
