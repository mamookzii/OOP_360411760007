package Lab3;
//**ข้อนี้แค่เปลี่ยนจาก loop while เป็น Do while
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int input = 0;
        int count = 0; //ประกาศออกมาเพื่อหาAverage value

        do
         {
            System.out.print("Enter integers: ");
            input = sc.nextInt();
            if (input >=0) {
                total += input;
                count++;
            }
        }while (input >=0);  //while ตรงนี้ย้ายจากข้างบนมาอยู่ข้างล่าง

        System.out.println("Total: "+total);
        System.out.println("Average value."+(total/count));



    }
}
