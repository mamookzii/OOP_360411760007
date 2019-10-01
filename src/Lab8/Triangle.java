package Lab8;
//คำนวน พท.สามเหลี่ยม
public class Triangle extends Graphicobject{

    private double b;
    private double h;


    //constructor
    public Triangle (){}
    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }


    @Override
    void findArea() {
         super.area = 0.5 * (b*h);
         System.out.println("The area of Triangle:  "+super.area);
    }


//getter setter
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getH() {
        return h;
    }
    public void setH(double h) {
        this.h = h;
    }







}//class
