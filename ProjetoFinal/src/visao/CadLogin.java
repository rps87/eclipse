package visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

import modelo.Conecta;

public class CadLogin extends JFrame
{

	private static final long serialVersionUID = 1L;
	
	private JLabel LblTitulo;
	private JLabel LblUsuario;
	private JTextField TxtUsuario;
	private JLabel LblSenha;
	private JTextField TxtSenha;
	private JButton btnCadastrar;
	private JButton btnLimpar;
	private JButton btnVoltar;
	
	boolean resultado;
	
	public String usuario = null; 
	public String senha = null; 
	
	public CadLogin()
	{
		super("ProjetoFinal - CADASTRO LOGIN");
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
		LblTitulo = new JLabel("CADASTRO DE LOGIN");
		LblTitulo.setFont(new Font("Dialog", Font.BOLD, 16));
		LblTitulo.setForeground(Color.WHITE);
		LblTitulo.setBounds(140, 20, 300, 100);
		this.getContentPane().add(LblTitulo);
		
		LblUsuario = new JLabel("USUARIO: ");
		LblUsuario.setForeground(Color.WHITE);
		LblUsuario.setBounds(80, 100, 80, 30);
		this.getContentPane().add(LblUsuario);
		
		TxtUsuario = new JTextField();
		TxtUsuario.setForeground(Color.WHITE);
		TxtUsuario.setBackground(Color.GRAY);
		TxtUsuario.setBounds(160, 100, 120, 30);
		this.getContentPane().add(TxtUsuario);
		
		LblSenha = new JLabel("SENHA: ");
		LblSenha.setForeground(Color.WHITE);
		LblSenha.setBounds(80, 150, 80, 30);
		this.getContentPane().add(LblSenha);
		
		TxtSenha = new JTextField();
		TxtSenha.setForeground(Color.WHITE);
		TxtSenha.setBackground(Color.GRAY);
		TxtSenha.setBounds(160, 150, 120, 30);
		this.getContentPane().add(TxtSenha);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setBackground(Color.BLACK);
		btnCadastrar.setBounds(100, 200, 120, 30);
		this.getContentPane().add(btnCadastrar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setForeground(Color.WHITE);
		btnLimpar.setBackground(Color.BLACK);
		btnLimpar.setBounds(250, 200, 120, 30);
		this.getContentPane().add(btnLimpar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setBackground(Color.BLACK);
		btnVoltar.setBounds(300, 300, 120, 30);
		this.getContentPane().add(btnVoltar);
		
		btnCadastrar.addActionListener(new ActionListener()
	    {public void actionPerformed(ActionEvent e){
	    	usuario = TxtUsuario.getText();
	    	senha = TxtSenha.getText();
	    	Verifica();
	    	}});
		
		btnLimpar.addActionListener(new ActionListener()
	    {public void actionPerformed(ActionEvent e){TxtUsuario.setText("");TxtSenha.setText("");}});
		
		btnVoltar.addActionListener(new ActionListener()
	    {public void actionPerformed(ActionEvent e){Fechar();}});
	}
	
	public void Verifica()
	{
		Conecta con = new Conecta();
		resultado = con.VerificaLogin(usuario, senha);
		if(resultado == true)
			con.CadastraLogin(usuario, senha);
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