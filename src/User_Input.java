import java.util.Scanner;
public class User_Input {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();//next pega só a primeira palvra e nada depois do espaço
        scanner.nextLine();//Utilizado para não pegar uma linha vazia sem querer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your GPI: ");
        double gpa = scanner.nextDouble();

        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        if (isStudent){
            System.out.println("You are enrolled as a Student");
        }
        else{
            System.out.println("You are not enrolled as a Student");
        }
        System.out.println("Hello " + name + " Your age is "+age+" And your GPA is "+gpa);
        scanner.close();
    }
}
