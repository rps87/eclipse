package controlador;

import javax.swing.JOptionPane;

public class Menu
{
	static Integer opcao;
	
	public static void MetodoMenu()
	{
		opcao = Integer.parseInt(JOptionPane.showInputDialog("SISTEMA DE NOTAS - v1\n\n1 - Cadastro\n2 - Lan�amento\n3 - Lista\n0 - Sair\n\nEscolha uma OP��O:"));
		
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
		}
	}
}