
package fornecedoresController;

import fornecedores.CadastrarUsuario;
import fornecedores.Logar;
import fornecedoresDAO.LoginDAO;
import fornecedoresDAO.conexao;
import java.sql.Connection;
import java.sql.SQLException;


public class LoginController {
       public void LoginUsuario(CadastrarUsuario view)
        throws SQLException
    {
       Connection conexao=new conexao().getConnection();
       LoginDAO cadastro=new LoginDAO();
       cadastro.cadastrarUsuario(view.getJusuario().getText(),view.getJnome().getText(),view.getJsenha().getText());
    
}
       public void loginUsuario(Logar view) throws SQLException{
           Connection conexao=new conexao().getConnection();
           LoginDAO login=new LoginDAO();
           login.logarUsuario(view.getjUsuarioLogar().getText(),view.getjSenhaLogar().getText());
                  
           
       }
}
