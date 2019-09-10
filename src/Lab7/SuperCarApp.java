package Lab7;

import java.util.Scanner;

public class SuperCarApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Car Brand?:  ");
        String a = sc.nextLine();

        System.out.println("Car Color?:  ");
        String b = sc.nextLine();

        System.out.println("Car Engine Size?:  ");
        int c = sc.nextInt();

        System.out.println("Max Speed?:  ");
        String d = sc.nextLine();

        System.out.println("country Of Origin?:  ");
        String e = sc.nextLine();



        SuperCar car = new SuperCar(a,b,c,d,e);
        car.getSuperinfo();



















    }



















}//class
