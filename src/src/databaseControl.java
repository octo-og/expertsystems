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
    }

    public boolean productassessment(String name,String size,String weight,String price,String colour,String productId)
    {
        boolean resultSet = false;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
          resultSet=  stmt.execute("insert into product_to_assess(\n" +
                  "    name,\n" +
                  "    size,\n" +
                  "    weight,\n" +
                  "    price,\n" +
                  "    colour,\n" +
                  "    productID)\n" +
                  "values (\n" +
                  "    '"+name+"',\n" +
                  "    '"+size+"',\n" +
                  "    '"+weight+"',\n" +
                  "    '"+price+"',\n" +
                  "    '"+colour+"',\n" +
                  "    '"+productId+"')\n" +
                  ";");
                resultSet=true;
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
        }

        return resultSet;
    }
    public boolean assessedproduct(String name,String productID)
    {
        boolean resultSet = false;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
          resultSet=  stmt.execute("insert into product (\n" +
                  "    name,\n" +
                  "    product_id,\n" +

                  "values (\n" +
                  "    '"+name+"',\n" +
                  "     '"+productID+"',\n" +
                  ";");
                resultSet=true;
        }
        catch (SQLException | ClassNotFoundException throwable) {
            System.out.println(throwable);
        }

        return resultSet;
    }
    public boolean responder(int working,int workplace, int student, int levelofstudy, int residence,int whatsapp,int instagram, int tweeter,
                               int facebook, int tiktok, int willing, int able,int productID)
    {
        boolean resultSet = false;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
          resultSet=  stmt.execute("insert into responder (working,workplace,student,levelofstudy,residence,whatsapp,instagram,tweeter,facebook,tiktok,willing,able,productID)" +
                  " values ('"+ working+"','"+workplace+"','"+student+"','"+levelofstudy+"','"+residence+"','"+whatsapp+"','"+instagram+"','"+tweeter+"','"+facebook+"','"+ tiktok+"','"+willing+"','"+able+"','"+productID+"');");
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
    public ArrayList<String> AssessmentName()
    {

        ArrayList<String> dbName =new ArrayList<String>();
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select name from product_to_assess;");
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
        return product;
    }
    public String[] product_in_assessment(String productId)
    {

       String[] product = new String[5];
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select * from product_to_assess where productID='"+productId+"';");
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
 public ArrayList<String>AssessmentproductId()
    {

        ArrayList<String> dbproductId =new ArrayList<String>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select productID from product_to_assess;");
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
    public int AssessmentNameCount()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(" select count(name) from product_to_assess;");
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
    public boolean deleteproduct(String id)
    {
        boolean done;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            stmt.execute("delete from product where productID='"+id+"';");
            con.close();
            done=true;
        }
        catch (SQLException | ClassNotFoundException throwable) {
            throwable.printStackTrace();
            done=false;
        }

        return done;
    }

    public int doctorBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"workplace\") from responder where workplace=\"2\" and willing =1;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
    public int doctorAbleBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"workplace\") from responder where workplace=\"2\" and able =1;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
    public int doctorNotBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"workplace\") from responder where workplace=\"2\" and willing =0;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
    public int doctorNotAbleBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"workplace\") from responder where workplace=\"2\" and able =0;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
 public int teacherBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"workplace\") from responder where workplace=\"1\" and willing =1;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
    public int teacherAbleBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"workplace\") from responder where workplace=\"1\" and able =1;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
public int teacherNotBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"workplace\") from responder where workplace=\"1\" and willing =0;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
public int teacherNotAbleBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"workplace\") from responder where workplace=\"1\" and able=0;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
public int farmerBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"workplace\") from responder where workplace=\"3\" and willing =1;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
    public int farmerAbleBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"workplace\") from responder where workplace=\"3\" and able=1;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }

public int farmerNotBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"workplace\") from responder where workplace=\"3\" and willing =0;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
    public int farmerNotAbleBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"workplace\") from responder where workplace=\"3\" and able=0;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
public int indurstryBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"workplace\") from responder where workplace=\"5\" and willing =1;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
public int indurstryAbleBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"workplace\") from responder where workplace=\"5\" and able =1;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
    public int indurstryNotBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"workplace\") from responder where workplace=\"5\" and willing =0;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
    public int indurstryNotAbleBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"workplace\") from responder where workplace=\"5\" and able =0;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
 public int businessBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"workplace\") from responder where workplace=\"4\" and willing =1;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
    public int businessAbleBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"workplace\") from responder where workplace=\"4\" and able =1;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
public int businessNotBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"workplace\") from responder where workplace=\"4\" and willing =0;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
public int businessNotAbleBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"workplace\") from responder where workplace=\"4\" and able =0;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
public int studentBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"student\") from responder where student=\"1\" and willing =1;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
public int studentAbleBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"student\") from responder where student=\"1\" and able =1;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
public int studentNotBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"student\") from responder where student=\"1\" and willing =0;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
public int studentNotAbleBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"student\") from responder where student=\"1\" and able =0;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
public int allWorkers()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"working\") from responder where working=\"1\";");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
    public int allResponders()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"working\") from responder;");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }

 public int allYesBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"willing\") from responder where willing=\"1\";");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
    public int allYesAbleBuy()
    {

        int result =0;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/expert","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select count(\"willing\") from responder where able=\"1\";");
            while(rs.next())
                result =rs.getInt(1);
            // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
            System.out.println(result);
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }
}
