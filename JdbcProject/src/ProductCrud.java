import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ProductCrud {

    public static void main(String [] args) throws  Exception{

       Product product = new Product();
       Discount discount= new Discount();
       product.setId(13L);
       product.setProduct_code("Emp121");
       product.setProduct_name("Lg Tv");
       product.setProduct_description("Smart Tv");
       Date d1 = new Date();

       product.setCreated_date(new java.sql.Date(d1.getTime()));
       product.setModified_date(new java.sql.Date(d1.getTime()));
       product.setCreated_by(1);
       product.setModified_by(1);
       product.setStatus(1);
       product.setUser_id(1L);
       product.setDiscount_id(1L);
       Connection con =ConnectioHelper.getConnection();
       //System.out.println(con);
        Statement stmt=con.createStatement();
        Statement dst=con.createStatement();

//       ResultSet rs=stmt.executeQuery("select * from product");
    //  stmt.executeQuery("insert into emp(id,name,address)values (4,'Vivek kumar','dwarka more)'");
        String sql = "INSERT INTO product VALUES ("+product.getId()+", '"+product.getProduct_name()+"', '"+product.getProduct_code()+"','"+product.getUser_id()+"','"+product.getDiscount_id()+"','"+product.getCreated_date()+"','"+product.getModified_date()+"','"+product.getCreated_by()+"','"+product.getModified_by()+"','"+product.getProduct_description()+"','"+product.getStatus()+"')";

        discount.setId(2L);
        discount.setRate(11.5);

        discount.setCreated_date(new java.sql.Date(d1.getTime()));
        discount.setModified_date(new java.sql.Date(d1.getTime()));
        discount.setCreated_by(1);
        discount.setModified_by(1);
        discount.setType("Electronics");
        System.out.println("Check2");
        String sql2 = "INSERT INTO discount VALUES ("+discount.getId()+", '"+discount.getName()+"',"+discount.getRate()+", '"+ discount.getCreated_date()+"', '"+ discount.getModified_date()+"','"+discount.getCreated_by(2)+"',"+discount.getModified_by()+",'"+discount.getType()+"')";
        dst.executeUpdate(sql2);
        stmt.executeUpdate(sql);


//        while(rs.next())
//            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
//        con.close();



    }

}
