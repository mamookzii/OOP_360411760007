package Lab8;

import org.omg.CORBA.PolicyError;

public class TestPolymorphism {
    public static void main(String[] args) {

        PresonEX PresonEX1,PresonEX2,PresonEX3;

        PresonEX1 = new PresonEX("Mark",1980);
        PresonEX2 = new Sheriff("Mateo",1981,"California");
        PresonEX3 = new Police("Danny",1986,"NYC");

        PresonEX1.introduce();
        PresonEX2.introduce();
        PresonEX3.introduce();





    }//main

}//class
