package Quiz1;

public class Student {
    private String Name;
    private String ID;
    private String Major;
    private double GPA;

    public Student() { }

    public Student(String name, String ID, String major, double GPA) {
        Name = name;
        this.ID = ID;
        Major = major;
        this.GPA = GPA;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", ID='" + ID + '\'' +
                ", Major='" + Major + '\'' +
                ", GPA='" + GPA + '\'' +
                '}';
    }


}//class
