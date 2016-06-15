package modelo;

import java.sql.*;

import javax.swing.*;

import visao.CadLogin;
import visao.Login;
import visao.Principal;

public class Conecta
{
	Login log = new Login();
	Principal pri = new Principal();
	CadLogin cadLog = new CadLogin();
	boolean resultado = false;
	
	public Conecta()
	{
		//Método Construtor Não Utilizado
	}
	
	public void Conexao(String nu, String su)
	{
		//JOptionPane.showMessageDialog(null, "Chegou !!!");
		try
		{
			boolean resLog = false;
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/aula","root","");
			Statement st = con.createStatement(); 
			ResultSet rs = st.executeQuery("SELECT * FROM login"); 
			if(rs!=null)
			{
				while(rs.next())	
				{
					String usu = rs.getString("usuario"); 
					String sen = rs.getString("senha"); 
					if((nu.trim().equals(usu)) && (su.trim().equals(sen)))
					{
						resLog = true;
						break;
					}
					else 
					{
						resLog = false;
					}
				}
				if(resLog == true)
				{
					JOptionPane.showMessageDialog(null, "Login Feito com Sucesso!!!");
					pri.Abrir(); 
					log.Fechar();
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "Usuário e/ou Senha Inválidos!!!");
				}
				rs.close();
			}
			con.close();
			}
		catch(SQLException e)
		{
			JOptionPane.showMessageDialog(null, "Erro: " + e);
		}
	}
	
	public boolean Verifica(String usuario, String senha)
	{
		try
		{
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/aula","root","");
			Statement st = con.createStatement(); 
			ResultSet rs = st.executeQuery("SELECT * FROM login"); 
			if(rs!=null)
			{
			while(rs.next())	
			{
				String usu = rs.getString("usuario"); 
				String sen = rs.getString("senha"); 
				if((usuario.trim().equals(usu)) && (senha.trim().equals(sen)))
				{
					JOptionPane.showMessageDialog(null, "Já existe um Usuário com Este Nome!!!");
				}
				else 
				{
					resultado = true;
				}
			}
			rs.close();
			}
			con.close();
			}
		catch(SQLException e)
		{
			JOptionPane.showMessageDialog(null, "Erro: " + e);
		}
		return resultado;
	}
	
	public void CadastraLogin(String usuario, String senha)
	{
		try
		{
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/aula","root","");
			Statement st = con.createStatement();
			st.executeUpdate("INSERT INTO login (usuario, senha) VALUES ('" + usuario + "', '" +senha + "')");
			JOptionPane.showMessageDialog(null, "Lançamento Feito com Sucesso!!!");
			con.close();
		}
		catch(SQLException e)
		{
			JOptionPane.showMessageDialog(null, "Erro: " + e);
		}
	}
	
	public void CadastraPrincipal(String usuario, String senha)
	{
		try
		{
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/aula","root","");
			Statement st = con.createStatement();
			st.executeUpdate("INSERT INTO principal (nome, endereco, email, telefone, cidade) VALUES ('" + usuario + "', '" +senha + "')");
			JOptionPane.showMessageDialog(null, "Lançamento Feito com Sucesso!!!");
			con.close();
		}
		catch(SQLException e)
		{
			JOptionPane.showMessageDialog(null, "Erro: " + e);
		}
	}
}
