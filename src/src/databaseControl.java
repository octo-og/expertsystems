import java.sql.*;
public class databaseControl {
    public boolean productInsert(String name, float size, float weight, float price, String color)
    {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","devi","pass");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("insert into product values("+name+","+size+","+weight+","+price+","+color+") ;");
            for (int i=0;i<5;i++){
                System.out.println(name+size+weight+price+color);
            }
            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
        }

        return true;
    }
}
