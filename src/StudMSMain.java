import java.util.ArrayList;
import java.util.Scanner;

public class StudMSMain {
    static ArrayList<Student> stud = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addStudent(){
        System.out.println(" Enter your  ID: ");
        int studID = sc.nextInt();
        sc.nextLine();
        System.out.println(" Enter your Name: ");
        String studName = sc.nextLine();
        System.out.println(" Enter your Age: ");
        int studAge = sc.nextInt();
        sc.nextLine();
        System.out.println(" Enter your Course Name: ");
        String studCourse = sc.nextLine();

        stud.add(new Student(studID, studName, studAge, studCourse));
        System.out.println(" Student details added successfully!");

    }

    static void viewStudent(){
        if(stud.isEmpty()){
            System.out.println(" Not founded any student Records!");
            return;
        }
        System.out.println("studID\tstudName\tstudAge\tstudCourse");
        for(Student s : stud){
            System.out.println(s);
        }
    }

    static void updateStudent(){
        System.out.println(" Enter your updated ID: ");
        int studId=sc.nextInt();
        for(Student s: stud){
            if(s.getStudID() == studId){
                sc.nextLine();
                System.out.println(" Enter your updated Name: ");
                s.setStudName(sc.nextLine());
                System.out.println(" Enter your updated Age: ");
                s.setStudAge(sc.nextInt());
                sc.nextLine();
                System.out.println(" Enter your updated Course: ");
                s.setStudCourse(sc.nextLine());
                System.out.println(" Student details updated successfully!");
                return;
            }
        }
        System.out.println(" Not founded student ID!");
    }

    static void deleteStudent(){
        System.out.println(" Enter the ID to delete: ");
        int studID = sc.nextInt();
        for(Student s : stud){
            if(s.getStudID() == studID){
                stud.remove(s);
                System.out.println(" Student details deleted successfully!");
                return;
            }
        }
        System.out.println(" Not fouded student details!");
    }

    public static void main(String[] args) {
        int choices;
        do{
            System.out.println("    Student Management System    ");
            System.out.println("1) Add Student Details");
            System.out.println("2) View Student Details");
            System.out.println("3) Update Student Details");
            System.out.println("4) Delete Studennt Details");
            System.out.println("5) Exit");
            System.out.println("Enter choices: ");

            choices = sc.nextInt();
            switch(choices){
                case 1: addStudent();
                        break;
                case 2: viewStudent();
                        break;
                case 3: updateStudent();
                        break;
                case 4: deleteStudent();
                        break;
                case 5:
                    System.out.println("Exiting program...");
                default:
                    System.out.println("Invalid choice, please choose correct choice");
            }
        }while (choices !=5);
        sc.close();

    }

}