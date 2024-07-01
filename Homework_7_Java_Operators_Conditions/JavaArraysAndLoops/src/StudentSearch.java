public class StudentSearch {
    public static void main(String[] args) {
        int[] studentIDs = {12345, 67890, 54321, 98765, 24680};
        int searchID = 54321;
        boolean isStudentPresent = false;

        for (int studentID : studentIDs) {
            if (studentID == searchID) {
                isStudentPresent = true;
                System.out.println("Student with ID " + searchID + " was found.");
                break;
            }
        }

        if (!isStudentPresent) {
            System.out.println("Student was not found.");
        }
    }
}