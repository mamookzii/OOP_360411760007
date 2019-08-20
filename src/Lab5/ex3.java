package Lab5;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        int num[][] = new  int[2][3];

        num[0][0] = 100;
        System.out.println(num[0][0]);

        //intput data ให้Userป้อนค่าเข้ามา

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) { //loop row iอ้างถึงrow
            for (int j = 0; j < num[i].length; j++) {  //lop colum jอ้างถึงcolum

             System.out.print("Enter num ["+i+"]["+j+"]:  ");
             num[i][j] = sc.nextInt();
            }//colum
        }//row

        //display data
        System.out.println("Data in array");

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+"\t");     // "\t" คือการแทป
             }

        }















    }//main
}//class
