package visao;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;

public class Relatorio extends JFrame
{
	static final long serialVersionUID = 1L;
	
	private JPanel Painel;
    private JTable table;
    private JScrollPane scrollPane;
    
    private String colunas[] = { "ID", "NOME", "ENDERECO", "EMAIL", "TELEFONE", "CIDADE" };
	
	private JButton btnVoltar;
	
	public Relatorio()
	{
		this.setTitle("ProjetoFinal - RELATÓRIO");
		this.setLayout(null);
    	this.setSize(500, 400);
    	this.getContentPane().setBackground(new Color(120,120,120));
    	this.setResizable(false);
    	this.setLocationRelativeTo(null);
    	this.setDefaultCloseOperation(3);
    	
    	// Cria o PAINEL
		Painel = new JPanel();
		Painel.setLayout(new BorderLayout());
		Painel.setBounds(10, 50, 475, 220);
		Painel.setBackground(new Color(120,120,120));
    	this.getContentPane().add(Painel);
    	
    	this.addComponentes();
    	//setVisible(false);
    	
	}
	
	private void addComponentes()
	{  
		String valores[][] = { {"1", "nome", "rua A", "adm@mail.com", "111-111", "City" }};
		int x = 0;
		int y = 0;
        try
		{
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/aula","root","");
			Statement st = con.createStatement(); 
			ResultSet rs = st.executeQuery("SELECT * FROM login"); 
			if(rs!=null)
			{
				while(rs.next())	
				{
					String id = String.valueOf(rs.getInt("id")); 
					String nome = rs.getString("nome");
					
					/*String valores[][] = { {id, nome, "rua A", "adm@mail.com", "111-111", "City" },
		        		{ "admin", "rua A", "adm@mail.com", "111-111", "City" },
		        		{ "admin", "rua A", "adm@mail.com", "111-111", "City"  },
		        		{ "admin", "rua A", "adm@mail.com", "111-111", "City" },
		        		{ "admin", "rua A", "adm@mail.com", "111-111", "City" },
		        		{ "admin", "rua A", "adm@mail.com", "111-111", "City" } };*/
				}
				rs.close();
			}
			con.close();
			}
		catch(SQLException e)
		{
			JOptionPane.showMessageDialog(null, "Erro: " + e);
		}

        table = new JTable(valores, colunas);
        table.getColumnModel().getColumn(0).setPreferredWidth(10);
        table.getColumnModel().getColumn(0).setResizable(false);
        table.getColumnModel().getColumn(1).setPreferredWidth(50);
        table.getColumnModel().getColumn(1).setResizable(false);
        table.getColumnModel().getColumn(2).setPreferredWidth(60);
        table.getColumnModel().getColumn(2).setResizable(false);
        table.getColumnModel().getColumn(3).setPreferredWidth(60);
        table.getColumnModel().getColumn(3).setResizable(false);
        table.getColumnModel().getColumn(4).setPreferredWidth(40);
        table.getColumnModel().getColumn(4).setResizable(false);
        table.getColumnModel().getColumn(5).setPreferredWidth(40);
        table.getColumnModel().getColumn(5).setResizable(false);
        scrollPane = new JScrollPane(table);
        Painel.add(scrollPane, BorderLayout.CENTER);
		
		// Cria o Botao de VOLTAR
		btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setBackground(Color.BLACK);
		btnVoltar.setBounds(300, 300, 120, 20);
		//getContentPane().add(btnVoltar);
		this.getContentPane().add(btnVoltar);
		
		btnVoltar.addActionListener(new ActionListener()
	    {public void actionPerformed(ActionEvent e){Fechar();}});
	    
	}
	
	public void Abrir()
	{
		setVisible(true);
	}
	
	public void Fechar()
	{
		setVisible(false);
	}
}