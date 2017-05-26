package modelo;

import java.sql.*;

public class Conexao {
    
    public Connection con = null;
    
    public void Conecta() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco","root","");
    }
    
    public void Desconecta() throws SQLException, ClassNotFoundException{
        con.close();
    }
    
    public void Cadastra(String nom, String ema, String end, String tel) 
            throws SQLException, ClassNotFoundException{
        Conecta();
        Statement st = con.createStatement();
        st.executeUpdate("INSERT INTO cliente(nome,email,endereco,telefone) VALUES"
                        + "('"+nom+"','"+ema+"','"+end+"','"+tel+"')");
        Desconecta();
    }
}
