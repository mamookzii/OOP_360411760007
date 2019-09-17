package Quiz1;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your Name?:  ");
        String n = sc.nextLine();
        System.out.print("ID?:  ");
        String id = sc.nextLine();
        System.out.print("Major?:  ");
        String m = sc.nextLine();


        System.out.print("Subject A?:  ");
        String SA = sc.nextLine();
        System.out.print("Subject B?:  ");
        String SB = sc.nextLine();
        System.out.print("Subject C?:  ");
        String SC = sc.nextLine();

        double g1 = compereGrade(SA);
        double g2 = compereGrade(SB);
        double g3 = compereGrade(SC);

        double GPA = (g1+g2+g3)/3;
        Student std1 = new Student(n,id,m,GPA);
        System.out.println(std1.toString());



    }//main

            private static double compereGrade(String SA) {

                if (SA.equals("A")||SA.equals("a")) {
                    return  4.00;
                } else if (SA.equals("B+")||SA.equals("b+")) {
                    return  3.50;
                } else if (SA.equals("B")||SA.equals("b")) {
                    return  3.00;
                } else if (SA.equals("C+")||SA.equals("c+")) {
                    return  2.50;
                } else if (SA.equals("C")||SA.equals("c")) {
                    return  2.00;
                } else if (SA.equals("D+")||SA.equals("d+")) {
                    return  1.50;
                } else if (SA.equals("D")||SA.equals("d")) {
                    return  1.00;
                } else if (SA.equals("F")||SA.equals("f")) {
                   return  0.00;
                }
                return 0.00;

            }





}//class
