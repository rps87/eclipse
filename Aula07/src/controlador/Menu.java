package controlador;

import javax.swing.*;

public class Menu
{
	static Integer opcao;
	
	public Menu()
	{	
		final JPanel painel = new JPanel();
		final JRadioButton op1 = new JRadioButton("Cadastro");
		final JRadioButton op2 = new JRadioButton("Lancamento");
		
		painel.add(op1);
		painel.add(op2);
		
		JOptionPane.showMessageDialog(null, painel);
		/*JLabel titulo = new JLabel("SISTEMA DE NOTAS - v3");
		JRadioButton op1 = new JRadioButton("Cadastro", false);
		JRadioButton op2 = new JRadioButton("Lan�amento", false);
		JRadioButton op3 = new JRadioButton("Lista", false);
		JRadioButton op4 = new JRadioButton("Sair", false);
		painel.add(titulo);
		painel.add(op1);
		painel.add(op2);
		painel.add(op3);
		painel.add(op4);*/
	}
	
	public static void MetodoMenu()
	{
		//JOptionPane.showInputDialog(null, painel, "Selection", JOptionPane.DEFAULT_OPTION);
		/*opcao = Integer.parseInt(JOptionPane.showInputDialog("SISTEMA DE NOTAS - v1\n\n1 - Cadastro\n2 - Lan�amento\n3 - Lista\n0 - Sair\n\nEscolha uma OP��O:"));
		
		if((opcao == null)||(opcao == 0))
		{
			JOptionPane.showMessageDialog(null, "Finalizado Programa!!!");
			System.exit(0);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Op��o escolhida: " + opcao);
		
			switch(opcao)
			{
				case 1: 
					// Cadastra Aluno
					//ColetaDados();
				case 2:
					// Lan�a Notas
					//Lancamento();
				case 3:
					// Lista Notas
					//GeraLista();
				default: break;
			}
		}*/
	}
}