import java.util.*;
class Student{
  String name;
  int rollnumber;
  int marks;

  Student(String name,int rollnumber,int marks){
    this.name=name;
    this.rollnumber=rollnumber;
    this.marks=marks;
  }
}

public class StudentRecordManagement {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        Student[] students=new Student[5];
        int count = 0;

        while (true) {
            System.out.println("\n--- Student Record System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Calculate Average Marks");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    if (count < students.length) {
                        System.out.print("Enter Name: ");
                        String name = input.nextLine();
                        System.out.print("Enter Roll Number: ");
                        int roll = input.nextInt();
                        System.out.print("Enter Marks: ");
                        int marks = input.nextInt();
                        students[count] = new Student(name, roll, marks);
                        count++;
                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Cannot add more students. Limit reached.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No student records found.");
                    } else {
                        System.out.println("\n--- All Students ---");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Name: " + students[i].name + 
                                               ", Roll: " + students[i].rollnumber + 
                                               ", Marks: " + students[i].marks);
                        }
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("No student records to search.");
                    } else {
                        System.out.print("Enter Roll Number to search: ");
                        int rollSearch = input.nextInt();
                        boolean found = false;
                        for (int i = 0; i < count; i++) {
                            if (students[i].rollnumber == rollSearch) {
                                System.out.println("Student Found -> Name: " + students[i].name + 
                                                   ", Roll: " + students[i].rollnumber + 
                                                   ", Marks: " + students[i].marks);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Student not found.");
                        }
                    }
                    break;

                case 4:
                    if (count == 0) {
                        System.out.println("No student records to calculate average.");
                    } else {
                        int sum = 0;
                        for (int i = 0; i < count; i++) {
                            sum += students[i].marks;
                        }
                        double avg = (double) sum / count;
                        System.out.println("Average Marks: " + avg);
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    input.close();
                    return;

                     default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}