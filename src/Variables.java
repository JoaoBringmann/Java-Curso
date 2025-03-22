import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Variables {

    public static void main(String[] args){

        //Variable = a reusable container for a value
        //A variable behaves as if it was the value it contains

        //Primitive = Simple value stored directly in memory (stack0
        //Reference = Memory address (stack) that points to the (heap)


        //Primitive vs Reference
        //  int          string
        //  double       array
        //  char         object
        //  boolean


        int age = 20;
        int year = 2004;
        int quantity = 333;
        System.out.println("The year is "+ year);
        //
        double price = 19.99;
        double gpa = 3.5;
        double temperature = 22.76;
        System.out.println("The price is "+ price);
        //
        char grade = 'A';
        char symbol = '!';
        System.out.println("Your grade is "+ grade);
        //
        boolean isStudent = true;
        boolean forSale = false;
        System.out.println(isStudent);
        //
        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student!");
        }
        //
        String name = "João Vitor";
        String email = "fake10.@hgo.com.br";
        String color = "red";
        String car = "Ferrari";
        System.out.println("Your email is" + email);

        System.out.println("Hello "+name);
        System.out.println("You are "+age+"years old");
        System.out.println("Your average age is "+age);

        System.out.println("Your choice is a "+ color+" "+year+" "+car );
        if (forSale){
            System.out.println("There is a"+car+" for sale");
        }
        else{
            System.out.println("The "+car+" is not for sale");
        }
    }

}

