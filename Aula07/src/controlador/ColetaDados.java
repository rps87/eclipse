package controlador;

import javax.swing.JOptionPane;

public class ColetaDados
{
	static int indAlunos;
	static Integer mat;
	static String nome;
	static Integer turma;
	
	public static void MetodoColetaDados()
	{
		mat = Integer.parseInt(JOptionPane.showInputDialog("SISTEMA DE NOTAS - v1 - Cadastro De Alunos\n\nInforme MATRÍCULA:"));
		nome = JOptionPane.showInputDialog("SISTEMA DE NOTAS - v1 - Cadastro De Alunos\n\nInforme NOME:");
		turma = Integer.parseInt(JOptionPane.showInputDialog("SISTEMA DE NOTAS - v1 - Cadastro De Alunos\n\nInforme TURMA:"));
		
		if((mat == null)||(nome == null)||(turma == null))
		{
			JOptionPane.showMessageDialog(null, "Finalizado Programa!!!");
			System.exit(0);
		}
		else
		{
			if((nome.trim().equals(""))||(mat<=0)||(turma<=0))
			{
				JOptionPane.showMessageDialog(null, "Valores não informados ou INCORRETOS!!!");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Aluno cadastrado com SUCESSO!!!\n\nMATRICULA: " + mat + "\nNOME: " + nome + "\nTURMA: " + turma);
				indAlunos++;
			}
		}
		Menu.MetodoMenu();
	}
}