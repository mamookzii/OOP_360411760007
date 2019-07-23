package Lab1;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("What is your name?: ");
        String name = scanner1.nextLine();
        System.out.println(name);

        System.out.print("How old are you?:  ");
        int old = scanner.nextInt();
        System.out.println(old);

        System.out.print("Email?:  ");
        String Email = scanner1.nextLine();
        System.out.println(Email);




    }//main

}//class
