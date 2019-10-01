package Lab8;

public class PresonEX {

    String name;
    int bornYear;

    public  PresonEX(String name,int bornYear){
        this.name = name;
        this.bornYear = bornYear;
    }
    public void introduce(){
        System.out.print("My name is " +name+",");
        System.out.println("I was born in "+bornYear+".");

    }


}//class
