package Lab8;
//คำนวน พท.วงกลม
public class Circle extends Graphicobject {
//attributes
    private double r;
    static double PT = 3.141;

    //constructor
    public Circle (){}
    public Circle(double r) {
        this.r = r;
    }

    @Override
    void findArea() {
        super.area = PT * (r*r);
        System.out.println("The area of Circle:  "+ super.area);

    }


    //getter and setter

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public static double getPT() {
        return PT;
    }



}//class
