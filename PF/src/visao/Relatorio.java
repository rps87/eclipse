package visao;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Relatorio extends JFrame
{
	static final long serialVersionUID = 1L;
	
	private JButton btnVoltar;
	
	public Relatorio()
	{
		super("ProjetoFinal - RELATÓRIO");
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
		btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setBackground(Color.BLACK);
		btnVoltar.setBounds(300, 300, 120, 20);
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