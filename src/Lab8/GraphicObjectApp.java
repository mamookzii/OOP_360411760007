package Lab8;

import java.util.Scanner;

public class GraphicObjectApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //input r
        System.out.println("Enter r: ");
        double r = sc.nextDouble();


        Graphicobject O1 = new Circle(r);
        O1.findArea();
        System.out.println(O1.area);






    }//main






}//class
