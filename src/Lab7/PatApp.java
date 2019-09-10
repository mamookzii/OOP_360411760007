package Lab7;

public class PatApp {
    public static void main(String[] args) {
        //create class instant (object)
        Pet pet1 = new Pet();                   //Pet()ทำการเรียกconstructorจากไฟล์Pet //pat1ชื่อobjectเหมือนScanner

        pet1.setOwnerName("Mook");
        pet1.setPatName("owen");
        pet1.setPatAge(2);

        System.out.println(pet1.getOwnerName());
        System.out.println(pet1.getPatName());
        System.out.println(pet1.getPatAge());

        //สร้างเอง
        Pet pet2 = new Pet();
        pet2.setOwnerName("Mint");
        pet2.setPatName("TiB");
        pet2.setPatAge(10);

        System.out.println(pet2.getOwnerName());
        System.out.println(pet2.getPatName());
        System.out.println(pet2.getPatAge());

        Pet pet3 = new Pet("Mook","Lala",5 );
        System.out.println(pet3.getOwnerName());
        System.out.println(pet3.getPatName());
        System.out.println(pet3.getPatAge());
        //ถ้าจะเปลี่ยนเจ้าของให้ทำการ setพอปริ้นออกมาจะเปลี่ยนชื่อให้เลย
        pet3.setOwnerName("Tib");









    }//class























}
