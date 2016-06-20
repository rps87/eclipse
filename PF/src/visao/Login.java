package visao;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import modelo.Conecta;

public class Login extends JFrame
{
	private static final long serialVersionUID = 1L;
	private JLabel LblTitulo;
	private JLabel LblNome;
	private JTextField TxtNome;
	private JLabel LblSenha;
	private JTextField TxtSenha;
	private JButton btnLogin;
	private JButton btnLimpar;
	private JButton btnCadastrar;
	public String usuario = null; 
	public String senha = null; 
	
	public Login()
	{
		super("ProjetoFinal - LOGIN");
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
		LblTitulo = new JLabel("TELA DE LOGIN");
		LblTitulo.setFont(new Font("Dialog", Font.BOLD, 16));
		LblTitulo.setForeground(Color.WHITE);
		LblTitulo.setBounds(180, 5, 300, 100);
		this.getContentPane().add(LblTitulo);
		
		LblNome = new JLabel("NOME: ");
		LblNome.setForeground(Color.WHITE);
		LblNome.setBounds(140, 90, 50, 30);
		this.getContentPane().add(LblNome);
		
		TxtNome = new JTextField();
		TxtNome.setForeground(Color.WHITE);
		TxtNome.setBackground(Color.GRAY);
		TxtNome.setBounds(200, 90, 120, 30);
		this.getContentPane().add(TxtNome);
		
		LblSenha = new JLabel("SENHA: ");
		LblSenha.setForeground(Color.WHITE);
		LblSenha.setBounds(140, 140, 50, 30);
		this.getContentPane().add(LblSenha);
		
		TxtSenha = new JTextField();
		TxtSenha.setForeground(Color.WHITE);
		TxtSenha.setBackground(Color.GRAY);
		TxtSenha.setBounds(200, 140, 120, 30);
		this.getContentPane().add(TxtSenha);
		
		btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(Color.BLACK);
		btnLogin.setBounds(120, 200, 120, 30);
		this.getContentPane().add(btnLogin);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setForeground(Color.WHITE);
		btnLimpar.setBackground(Color.BLACK);
		btnLimpar.setBounds(260, 200, 120, 30);
		this.getContentPane().add(btnLimpar);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setBackground(Color.BLACK);
		btnCadastrar.setBounds(200, 260, 120, 30);
		this.getContentPane().add(btnCadastrar);
		
		btnLogin.addActionListener(new ActionListener()
	    {public void actionPerformed(ActionEvent e){usuario = TxtNome.getText();senha = TxtSenha.getText();VerifLogin();}});
		
		btnLimpar.addActionListener(new ActionListener()
	    {public void actionPerformed(ActionEvent e){Limpar();}});
		
		btnCadastrar.addActionListener(new ActionListener()
	    {public void actionPerformed(ActionEvent e){ChamaCadastrar();}});
	}
	
	public void VerifLogin()
	{
		Conecta con = new Conecta();
		con.Conexao(usuario, senha);
	}
	
	public void ChamaCadastrar()
	{
		CadLogin cadast = new CadLogin();
		cadast.Cadastra();
	}
	
	public void Limpar() 
	{
		TxtNome.setText("");
		TxtSenha.setText("");
	}
	
	public void Abrir() 
	{
		setVisible(true);
		Limpar();
	}
	
	public void Fechar()
	{
		setVisible(false); 
	}
}









