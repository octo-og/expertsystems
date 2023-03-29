import java.sql.*;
import java.util.ArrayList;

public class databaseControl {
    public boolean productInsert(String name, float size, float weight, float price, String color)
    {
        boolean resultSet = false;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
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
    } public boolean responder(int working,int workplace, int student, int levelofstudy, int residence,int whatsapp,int instagram, int tweeter,
                               int facebook, int tiktok, int willing, int able)
    {
        boolean resultSet = false;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
          resultSet=  stmt.execute("insert into responder (\n" +
                  "     working,\n" +
                  "   workplace,\n" +
                  "   student,\n" +
                  "   levelofstudy,\n" +
                  "    residence)\n" + " whatsapp)\n" + "instagram)\n" + "tweeter)\n" + " facebook)\n" + " tiktok)\n" + " willing)\n" + " able)\n" +
                  "values (\n" +
                  "    '"+ working+"',\n" +
                  "     '"+workplace+"',\n" +
                  "    '"+student+"',\n" +
                  "    '"+levelofstudy+"',\n" +
                  "    '"+residence+"')\n" +"'"+whatsapp+"')\n" +"'"+instagram+"')\n" +" '"+tweeter+"')\n" +" '"+facebook+"')\n" +" '"+ tiktok+"')\n" +" '"+willing+"')\n" +"'"+able+"')\n" +
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
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select name from product;");
            while(rs.next()){

                productControl name =  new productControl();
                name.setName(rs.getString("name"));
                dbName.add(name.getName());
            }

            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
        }

        return dbName;
    } 
    public String[] productUpdate(String productId)
    {

       String[] product = new String[5];
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select * from product where productID='"+productId+"';");
            while(rs.next()){
                product[0]=rs.getString("name");
                product[1]=rs.getString("size");
                product[2]=rs.getString("weight");
                product[3]=rs.getString("price");
                product[4]=rs.getString("colour");
            }

            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
        }
for (int i=0;i<5;i++){
    System.out.println(product[i]);
}
        return product;
    }
    public ArrayList<String> productID()
    {

        ArrayList<String> dbproductId =new ArrayList<String>();
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select productID from product;");
            while(rs.next()){

                productControl productID =  new productControl();
                productID.setId(rs.getString("productID"));
                dbproductId.add(productID.getId());
            }

            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
        }

        return dbproductId;
    }
    public ArrayList<String> colour()
    {

        ArrayList<String> dbColour =new ArrayList<String>();
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select colour from product;");
            while(rs.next()){

                productControl name =  new productControl();
                name.setColor(rs.getString("colour"));
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
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select size from product;");
            while(rs.next()){

                productControl name =  new productControl();
                name.setSize(rs.getFloat("size"));
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
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select weight from product;");
            while(rs.next()){

                productControl name =  new productControl();
                name.setWeight(rs.getFloat("weight"));
                dbWeight.add(name.getWeight());
            }

            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
        }

        return dbWeight;
    }
    public boolean nameupdate(String name,String productID)
    {
        boolean done = false;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            stmt.execute("UPDATE product SET name='"+name+"' WHERE productID='"+productID+"';");
            done=true;
            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
        }

        return done;
    }
    public boolean coloutUpdate(String colour,String productID)
    {
        boolean done = false;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            stmt.execute("UPDATE product SET colour='"+colour+"' WHERE productID='"+productID+"';");
            done=true;
            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
        }

        return done;
    }
    public boolean sizeUpdate(String size,String productID)
    {
        boolean done = false;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            stmt.execute("UPDATE product SET size='"+size+"' WHERE productID='"+productID+"';");
            done=true;
            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
        }

        return done;
    }
    public boolean weigthtUpdate(String weight,String productID)
    {
        boolean done = false;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            stmt.execute("UPDATE product SET weight='"+weight+"' WHERE productID='"+productID+"';");
            done=true;
            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
        }

        return done;
    }
    public boolean priceUpdate(String price,String productID)
    {
        boolean done = false;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            stmt.execute("UPDATE product SET price='"+price+"' WHERE productID='"+productID+"';");
            done=true;
            con.close();
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
        }

        return done;
    }
    public int nameCount()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select count(name)from product;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
}
