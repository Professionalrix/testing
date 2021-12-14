import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class UserCrud
{

    public static void main (String[]args)throws Exception{

        Connection con =ConnectioHelper.getConnection();
        User user = new User();
        user.setId(3L);
        user.setName("Amit");
        user.setEmail("amitsingh10544@gmail.com");
        user.setPassword("123456");
        Date d1 = new Date();
        user.setCreated_date(new java.sql.Date(d1.getTime()));
        user.setModified_date(new java.sql.Date(d1.getTime()));
        user.setCreated_by(1);
        user.setModified_by(2);
        user.setEmployee_id(1L);
        Statement stmt=con.createStatement();

        //create user
       // String sql= "insert into user (id,name,email,password,created_date,modified_date,created_by,modified_by,employee_id) values("+user.getId()+",'"+user.getName()+"','"+user.getEmail()+"','"+user.getPassword()+"','"+user.getCreated_date()+"','"+user.getModified_date()+"',"+user.getCreated_by()+","+user.getModified_by()+","+user.getEmployee_id()+")";
        //stmt.executeUpdate(sql);


        // update user
        String updateName = "Mahaveer";
        Long updateId= 1L;
        String sql2= "update user set name ='"+updateName+"'where id="+updateId+"";
        //String sql1= "insert into user (id,name,email,password,created_date,modified_date,created_by,modified_by,employee_id) values(4,'"+user.getName()+"','"+user.getEmail()+"','"+user.getPassword()+"','"+user.getCreated_date()+"','"+user.getModified_date()+"',"+user.getCreated_by()+","+user.getModified_by()+","+user.getEmployee_id()+")";
        stmt.executeUpdate(sql2);

        //retrieve user details
        ResultSet rs=stmt.executeQuery("select * from  user");
        while(rs.next()) {
            System.out.println(rs.getLong(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
        }

        //delete user
        Long userId = 1L;
        String sql4= "delete from user where id="+userId+"";
        stmt.executeUpdate(sql4);


    }
}
