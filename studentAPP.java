import java.util.Scanner;

class studentRecord {
    String studentID;
     String name;
    String course;

    studentRecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

   public void displayinfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        
    }
}
public class studentAPP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();
    // Consume the newline character

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
     // 
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        studentRecord student1 = new studentRecord(studentID, name, course);

        student1.displayinfo();

        scanner.close();

}
}
    
            

      