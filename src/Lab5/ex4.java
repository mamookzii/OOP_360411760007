package Lab5;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int num[][] = new  int[2][3];

        input (num);
        displaydata (num);
        findaverage (num);
        mim (num);


    }//main

    private static void mim(int[][] num) {
        int max = num[0][0];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {

                if (max < num[i][j]) {
                    max = num[i][j];
                }
            }
        }

        System.out.println("Maximum: "+max);

    }

    private static void findaverage(int[][] num) {
        int total = 0;
        int count = 0; //count = num.length*num[].length
        int x = num.length * num[0].length;


        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j < num[i].length; j++) {
                total += num[i][j];
                count++;

            }
        }

        System.out.println("Average"+(total/count));
        System.out.println("Average"+(total/x) );
    }


    private static void displaydata(int[][] num) {
        System.out.println("Data in array");

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+"\t");     // "\t" คือการแทป
            }
        }
    }

    private static void input(int[][] num) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) { //loop row iอ้างถึงrow
            for (int j = 0; j < num[i].length; j++) {  //lop colum jอ้างถึงcolum

                System.out.print("Enter num ["+i+"]["+j+"]:  ");
                num[i][j] = sc.nextInt();
            }//colum
        }//row
    }







}//class
