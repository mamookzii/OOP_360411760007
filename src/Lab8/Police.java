package Lab8;

public class Police extends PresonEX{
    String workCountry;


    public Police(String name, int bornYear, String workCountry) {
        super(name, bornYear);
        this.workCountry = workCountry;

    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I'm a police and work in " +
                workCountry + ".");
    }
}//class
