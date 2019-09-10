package Lab7;

public class Pet {
    //class Attributes                                                //ทำการสร้างเมดตอท 2ตัวขึ้นมา เพื่อUserใช้งาน
                                                                      // getterอ่านค่าออกมาแสดง setter แก้ไขค่า

    private String ownerName;                                         //ownerNameชื่อสัตว์เลี้ยง
    private String petName;
    private int petAge;

    //constructor ไม่ทำอะไรใช้ในการสร้างobject เฉยๆ
    public  Pet(){}

    //this...เพื่ออ้างถึงprivate String....;ข้างบนมาใช้
    public Pet(String ownerName,String patName,int petAge){
        this.ownerName = ownerName;
        this.petName = patName;
        this.petAge = petAge;
    }




        //getter and setter methods
    public  String getOwnerName(){
        return this.ownerName;                                             //this ใช้อ้างถึงAttributesข้างบน
    }
    public void setOwnerName(String newOwnerName){
        this.ownerName = newOwnerName;
    }

        //patName
    public  String getPatName(){
        return this.petName;
    }
    public  void setPatName(String newPatName){
        this.petName = newPatName;
    }

    //patAge
    public int getPatAge(){
        return this.petAge;
    }
    public void setPatAge(int newPatAge){
        this.petAge = newPatAge;
    }




















}
