import java.sql.*;

public class ConnectDb {
    private static final String URL = "jdbc:postgresql://localhost:5432/Company";
    private static final String user="postgres";
    private static final String pass="Cutm@059";
    private static Connection connection=null;
    public  void connect(){
        try {
            connection= DriverManager.getConnection(URL,user,pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public int insert(Book_Details b){
        String sql="insert into books values(?,?,?)";
        try {
           PreparedStatement prt =connection.prepareStatement(sql);
           prt.setInt(1,b.getId());
           prt.setString(2, b.getName());
           prt.setInt(3,b.getPrice());
           return prt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean delete(int id){
        String sql="delete from books where Id=?";
        try {
            PreparedStatement prt=connection.prepareStatement(sql);
            prt.setInt(1,id);
           if(prt.executeUpdate()>0){
               return  true;
           }
           return  false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public int update(Book_Details b){
        String sql="update books set Name=?,Price=? where Id=?";
        try {
            PreparedStatement prt=connection.prepareStatement(sql);
            prt.setString(1,b.getName());
            prt.setInt(2,b.getPrice());
            prt.setInt(3,b.getId());
            return prt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void Search(int id){
        String sql="select*from books where Id=?";
        try {
            PreparedStatement prt=connection.prepareStatement(sql);
            prt.setInt(1,id);
            ResultSet rs= prt.executeQuery();
            if(rs.next()){
                System.out.println(rs.getInt(1)+"|"+rs.getString(2)+"|"+rs.getInt(3));
            }else
                System.out.println("Book not found");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public  void display(){
        String sql="select * from books";
        try {
            Statement smt= connection.createStatement();
            ResultSet rs= smt.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getInt(1)+"|"+rs.getString(2)+"|"+rs.getInt(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
