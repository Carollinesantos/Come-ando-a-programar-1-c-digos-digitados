
package fornecedoresDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
     public Connection getConnection() throws SQLException {
       Connection conexao=(Connection)
               DriverManager.getConnection("jdc:mysql://localhost:3306/fornecedores","root","123456");
       return conexao;
     }
     
}

