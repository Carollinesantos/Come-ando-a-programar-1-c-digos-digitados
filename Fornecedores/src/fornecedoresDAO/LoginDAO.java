
package fornecedoresDAO;

import fornecedores.MenuPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    public void cadastrarUsuario(String usuario,String nome,String senha) 
            throws SQLException {
        Connection conexao=new conexao().getConnection();
        String sql="insert into Usuarios(usuario,nome,senha) values" +
                "('"+usuario+"','"+nome+"','"+senha+"')";
        PreparedStatement statement=conexao.prepareStatement(sql);
        statement.execute();
        conexao.close();
    
}
    public void logarUsuario(String usuario,String senha) throws SQLException {
        Connection conexao=new conexao().getConnection();
        String sql="SELECT usuario,senha where usuario='"+usuario+"'and senha='"+senha+"';";
        System.out.println(sql);
        PreparedStatement stament=conexao.prepareStatement(sql);
        ResultSet rs=stament.executeQuery();
        
        if (rs.next()){
            System.out.print("Achou");
            new MenuPrincipal().setVisible(true);
            
        }else{
            System.out.println("Não achou");
        }
        conexao.close();
  }
}
