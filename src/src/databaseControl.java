import java.sql.*;
import java.util.ArrayList;

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

    public ArrayList<String> name()
    {

        ArrayList<String> dbName =new ArrayList<String>();
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","devi","pass");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select time from movie;");
            while(rs.next()){

                productControl name =  new productControl();
                name.setName(rs.getString("time"));
                dbName.add(name.getName());
            }

            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
        }

        return dbName;
    }
    public ArrayList<String> colour()
    {

        ArrayList<String> dbColour =new ArrayList<String>();
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","devi","pass");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select time from movie;");
            while(rs.next()){

                productControl name =  new productControl();
                name.setColor(rs.getString("time"));
                dbColour.add(name.getColor());
            }

            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
        }

        return dbColour;
    }
    public ArrayList<Float> size()
    {

        ArrayList<Float> dbSize =new ArrayList<Float>();
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","devi","pass");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select time from movie;");
            while(rs.next()){

                productControl name =  new productControl();
                name.setSize(rs.getFloat("time"));
                dbSize.add(name.getSize());
            }

            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
        }

        return dbSize;
    }
    public ArrayList<Float> weight()
    {

        ArrayList<Float> dbWeight =new ArrayList<Float>();
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","devi","pass");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select time from movie;");
            while(rs.next()){

                productControl name =  new productControl();
                name.setWeight(rs.getFloat("time"));
                dbWeight.add(name.getWeight());
            }

            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
        }

        return dbWeight;
    }
    public ArrayList<Float> price()
    {

        ArrayList<Float> dbPrice =new ArrayList<Float>();
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","devi","pass");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select time from movie;");
            while(rs.next()){

                productControl name =  new productControl();
                name.setPrice(rs.getFloat("time"));
                dbPrice.add(name.getPrice());
            }

            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
        }

        return dbPrice;
    }
}
