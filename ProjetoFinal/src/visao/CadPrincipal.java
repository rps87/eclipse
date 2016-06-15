package visao;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CadPrincipal extends JFrame
{

	private static final long serialVersionUID = 1L;
	
	private JLabel LblTitulo;
	private JLabel LblNome;
	private JTextField TxtNome;
	private JLabel LblEndereco;
	private JTextField TxtEndereco;
	private JLabel LblTelefone;
	private JTextField TxtTelefone;
	private JLabel LblCidade;
	private JTextField TxtCidade;
	private JLabel LblEmail;
	private JTextField TxtEmail;
	
	private JButton btnCadastrar;
	private JButton btnLimpar;
	private JButton btnConsultar;
	private JButton btnVoltar;
	
	String nome;
	String endereco;
	String email;
	String telefone;
	String cidade;
	
	boolean resultadoVerifica = false;
	boolean resultadoConsulta = false;
	
	public CadPrincipal()
	{
		super("ProjetoFinal - CADASTRO PRINCIPAL");
		setLayout(null);
    	setSize(500, 400);
    	this.getContentPane().setBackground(new Color(120,120,120));
    	setResizable(false);
    	setLocationRelativeTo(null);
    	setDefaultCloseOperation(3);
    	this.addComponentes();
    	setVisible(false);
	}
	
	private void addComponentes()
	{
		LblTitulo = new JLabel("CADASTRO DE DADOS - FORMULÁRIO PRINCIPAL");
		LblTitulo.setFont(new Font("Dialog", Font.BOLD, 16));
		LblTitulo.setForeground(Color.WHITE);
		LblTitulo.setBounds(40, 20, 500, 40);
		this.getContentPane().add(LblTitulo);
		
		LblNome = new JLabel("NOME: ");
		LblNome.setForeground(Color.WHITE);
		LblNome.setBounds(50, 80, 80, 30);
		this.getContentPane().add(LblNome);
		
		TxtNome = new JTextField();
		TxtNome.setForeground(Color.WHITE);
		TxtNome.setBackground(Color.GRAY);
		TxtNome.setBounds(140, 80, 280, 30);
		this.getContentPane().add(TxtNome);
		
		LblEndereco = new JLabel("ENDEREÇO: ");
		LblEndereco.setForeground(Color.WHITE);
		LblEndereco.setBounds(50, 120, 80, 30);
		this.getContentPane().add(LblEndereco);
		
		TxtEndereco = new JTextField();
		TxtEndereco.setForeground(Color.WHITE);
		TxtEndereco.setBackground(Color.GRAY);
		TxtEndereco.setBounds(140, 120, 280, 30);
		this.getContentPane().add(TxtEndereco);
		
		LblTelefone = new JLabel("TELEFONE: ");
		LblTelefone.setForeground(Color.WHITE);
		LblTelefone.setBounds(50, 160, 80, 30);
		this.getContentPane().add(LblTelefone);
		
		TxtTelefone = new JTextField();
		TxtTelefone.setForeground(Color.WHITE);
		TxtTelefone.setBackground(Color.GRAY);
		TxtTelefone.setBounds(140, 160, 100, 30);
		this.getContentPane().add(TxtTelefone);
		
		LblCidade = new JLabel("   CIDADE: ");
		LblCidade.setForeground(Color.WHITE);
		LblCidade.setBounds(240, 160, 80, 30);
		this.getContentPane().add(LblCidade);
		
		TxtCidade = new JTextField();
		TxtCidade.setForeground(Color.WHITE);
		TxtCidade.setBackground(Color.GRAY);
		TxtCidade.setBounds(320, 160, 100, 30);
		this.getContentPane().add(TxtCidade);
		
		LblEmail = new JLabel("EMAIL: ");
		LblEmail.setForeground(Color.WHITE);
		LblEmail.setBounds(50, 200, 80, 30);
		this.getContentPane().add(LblEmail);
		
		TxtEmail = new JTextField();
		TxtEmail.setForeground(Color.WHITE);
		TxtEmail.setBackground(Color.GRAY);
		TxtEmail.setBounds(140, 200, 280, 30);
		this.getContentPane().add(TxtEmail);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setBackground(Color.BLACK);
		btnCadastrar.setBounds(50, 240, 120, 30);
		this.getContentPane().add(btnCadastrar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setForeground(Color.WHITE);
		btnLimpar.setBackground(Color.BLACK);
		btnLimpar.setBounds(175, 240, 120, 30);
		this.getContentPane().add(btnLimpar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setForeground(Color.WHITE);
		btnConsultar.setBackground(Color.BLACK);
		btnConsultar.setBounds(300, 240, 120, 30);
		this.getContentPane().add(btnConsultar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setBackground(Color.BLACK);
		btnVoltar.setBounds(300, 300, 120, 20);
		this.getContentPane().add(btnVoltar);
	
		btnCadastrar.addActionListener(new ActionListener()
		    {public void actionPerformed(ActionEvent e){
		    	nome = TxtNome.getText();
		    	endereco = TxtEndereco.getText();
		    	email = TxtEmail.getText();
		    	telefone = TxtTelefone.getText();
		    	cidade = TxtCidade.getText();
		    	Verifica();
		    	}});
			
		btnLimpar.addActionListener(new ActionListener()
	    {public void actionPerformed(ActionEvent e){
	    	TxtNome.setText("");
	    	TxtEndereco.setText("");
	    	TxtEmail.setText("");
	    	TxtTelefone.setText("");
	    	TxtCidade.setText("");
	    	}});
		
		btnConsultar.addActionListener(new ActionListener()
	    {public void actionPerformed(ActionEvent e){Fechar();}});
		
		btnVoltar.addActionListener(new ActionListener()
	    {public void actionPerformed(ActionEvent e){Fechar();}});
	}
	
	public void Verifica()
	{
		
	}
	
	public void Cadastra()
	{
		 setVisible(true);
	}
	
	public void Fechar()
	{
		 setVisible(false);
	}
	
}