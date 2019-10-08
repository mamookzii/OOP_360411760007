package Lab9;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class exJDBC {
    public static void main(String[] args) throws ClassNotFoundException {

        //step1
        Class.forName("org.sqlite.JDBC");
        //step2
        String SQCONN = "jdbc:sqlite:Teat.sqlite";
        try {
            Connection conn = DriverManager.getConnection(SQCONN);
                if (conn == null){
                    System.out.println("Could not connect to database.");
                }else {
                    System.out.println("Connected to  database.");
                }

            //step3
                Statement stmt = conn.createStatement();
                String sql = "select * from user";
                ResultSet rs = stmt.executeQuery(sql);
            //step4
            ArrayList<User> myList = new ArrayList<User>();
                while (rs.next()){
//                    System.out.println("-------------------------------");
//                    System.out.println("ID: "+rs.getString(1));
//                    System.out.println("Name: "+rs.getString(2));
//                    System.out.println("Address: "+rs.getString(3));
//                    System.out.println("Tel: "+rs.getString(4));
//                    System.out.println("-------------------------------");

                    User myUser = new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
                    myList.add(myUser);


                }//while
            for (User u:myList) {
                System.out.println(u.toString());

            }


            //step5
                rs.close();
                stmt.close();
                conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }



    }//main


}//class
