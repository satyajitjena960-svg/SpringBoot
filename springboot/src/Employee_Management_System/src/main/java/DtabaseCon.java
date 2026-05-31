import java.sql.*;

public class DtabaseCon {
    private static final String URL = "jdbc:postgresql://localhost:5432/Company";
    private static  String user="postgres";
    private static String pass="Cutm@059";
    private static Connection connection=null;

    public  void connectToDb() {
        try {
            connection = DriverManager.getConnection(URL, user, pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public int insert(Employee_Details employees){
        String sql="insert into employees values (?,?,?,?)";

        try {
            PreparedStatement prt=connection.prepareStatement(sql);
            prt.setInt(1,employees.getId());
            prt.setString(2,employees.getName());
            prt.setString(3, employees.getPost());
            prt.setInt(4,employees.getSalary());
            return prt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public int update(Employee_Details d){
        String sql="update employees set Name=?,post=?,Salary=? where id=?";

        try {
            PreparedStatement prt=connection.prepareStatement(sql);
            prt.setString(1,d.getName());
            prt.setString(2, d.getPost());
            prt.setInt(3,d.getSalary());
            prt.setInt(4,d.getId());
            return prt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public  Boolean DeleteById(int id){
        String sql="delete from employees where id=?";
        try {
            PreparedStatement prt= connection.prepareStatement(sql);
            prt.setInt(1,id);
            if (prt.executeUpdate()>0){
                return  true;
            }
            return false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void display(){
        String sql="Select * from employees";
        try {
            Statement smt= connection.createStatement();
            ResultSet rs= smt.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getInt(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getInt(4));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void getByid(int id) {
        try {
            PreparedStatement prt=connection.prepareStatement("select * from employees where id =?");
            prt.setInt(1,id);
            ResultSet rt=prt.executeQuery();
            if(rt.next()){
                System.out.println(rt.getInt(1) +" |"+ rt.getString(2)+"|"+rt.getString(3)+"|"+rt.getInt(4));
            }else{
                System.out.println("Data not Exist");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
