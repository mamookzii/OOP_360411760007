package Lab8;

public class Sheriff extends PresonEX {
    String workState;

    public Sheriff(String name, int bornYear,String workState) {
        super(name, bornYear);
        this.workState = workState;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I'm a sheriff and work in" +workState+".");
    }


}//class


