package Lab4;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double r;
        System.out.println("กรอกค่ารัศมี");
        r = sc.nextDouble();

        double cc = cc (r);
        double aa = aa (r);
        double vv = vv (r);

        System.out.println("ค่ารัศมี"+cc);
        System.out.println("ค่าพื้นที่"+aa);
        System.out.println("ค่าปริมาตร"+vv);




    }

    private static double vv(double r) {
        double pi = 3.141;
        return (4/3*pi*r*r*r);
    }

    private static double aa(double r) {
        double pi = 3.141;
        return (2*r*r);
    }

    private static double cc(double r) {

        double pi = 3.141;
        return  (2*pi*r);

    }

}
