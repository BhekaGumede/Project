import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        //Asking the user the name
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name");
        String name = input.nextLine();
        System.out.println("Name: " + name);

        //Asking the user the surname
        System.out.println("What is your surname");
        String surname = input.nextLine();
        System.out.println("Surname: " + surname);

        //Calculation of the age
        System.out.println("You were born in which year");
        int year = input.nextInt();
        System.out.println("Age: " + (2021 - year) );


    }
}
