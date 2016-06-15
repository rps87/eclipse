package visao;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Principal extends JFrame
{
	private static final long serialVersionUID = 1L;
	Login login = new Login();
	JMenuBar menuBarra = new JMenuBar();
	JMenu menuIniciar = new JMenu("INICIAR");
	JMenu menuSair = new JMenu("LOGOUT");
	JMenuItem menuItemCadastro = new JMenuItem("CADASTRO");
	
	public Principal()
	{
		super("ProjetoFinal - v1");
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
		setJMenuBar(menuBarra);
		menuBarra.add(menuIniciar);
		menuBarra.add(menuSair);
		menuIniciar.add(menuItemCadastro); 
		
		menuSair.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent arg0) {Fechar();Limpar();}
			public void mouseEntered(MouseEvent arg0) {/**/}
			public void mouseExited(MouseEvent arg0) {/**/}
			public void mousePressed(MouseEvent arg0) {/**/}
			public void mouseReleased(MouseEvent arg0) {/**/}});
		
		menuItemCadastro.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e){CadPrincipal cad = new CadPrincipal();cad.Cadastra();}});
		
	}
	
	public void Limpar()
	{
		login.Limpar();
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