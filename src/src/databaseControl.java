import java.sql.*;
public class databaseControl {
    public boolean productInsert(String name, float size, float weight, float price, String color)
    {
        boolean resultSet = false;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","devi","pass");
            Statement stmt=con.createStatement();
          resultSet=  stmt.execute("insert into product (\n" +
                  "    name,\n" +
                  "    size,\n" +
                  "    weight,\n" +
                  "    price,\n" +
                  "    colour)\n" +
                  "values (\n" +
                  "    '"+name+"',\n" +
                  "     '"+size+"',\n" +
                  "    '"+weight+"',\n" +
                  "    '"+price+"',\n" +
                  "    '"+color+"')\n" +
                  ";");
                resultSet=true;
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
        }

        return resultSet;
    }
}
