package zona_fit.connection;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {

    public static Connection getConnection(){
        Connection connect = null;
        var dataBase = "zona_fit_db";
        var url = "JDBC:mysql://localhost:3306/" + dataBase;
        var user = "root";
        var password = "282219";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(url, user, password);
        }catch (Exception e){
            System.err.println("Erro for  connection with data base" + e.getMessage());
        }
        return connect;
    }

    public static void main(String[] args) {
        Connection connect = Connect.getConnection();
        if (connect != null){
            System.out.println("Connected for successfully !" + connect);
        }else {
            System.out.println("Connect failed !" + connect);
        }
    }
}
