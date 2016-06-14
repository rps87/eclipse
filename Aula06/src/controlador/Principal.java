package controlador;

import javax.swing.*;

public class Principal
{
	static String op;
	static Integer opcao;
	
	static int indAlunos;
	static int indLanc;
	
	static Integer mat;
	static String nome;
	static Integer turma;
	
	static int matLanc;
	static double n1;
	static double n2;
	static double n3;
	static double n4;
	static double med;
	
	static int apTodos;
	static int repTodos;
	static double medTodos;
	
	public static void main(String[] args)
	{
		Menu();
	}
	
	public static void Menu()
	{
		opcao = Integer.parseInt(JOptionPane.showInputDialog("SISTEMA DE NOTAS - v1\n\n1 - Cadastro\n2 - Lançamento\n3 - Lista\n0 - Sair\n\nEscolha uma OPÇÃO:"));
		
		if((opcao == null)||(opcao == 0))
		{
			JOptionPane.showMessageDialog(null, "Finalizado Programa!!!");
			System.exit(0);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Opção escolhida: " + opcao);
		
			switch(opcao)
			{
				case 1: 
					// Cadastra Aluno
					ColetaDados();
				case 2:
					// Lança Notas
					Lancamento();
				case 3:
					// Lista Notas
					GeraLista();
				default: break;
			}
		}
	}
	
	public static void ColetaDados()
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
		Menu();
	}
	
	public static void Lancamento()
	{
		String sit = "";

		matLanc = Integer.parseInt(JOptionPane.showInputDialog("SISTEMA DE NOTAS - v1 - Lançasmento de Notas\n\nInforme MATRÍCULA:"));
		n1 = Double.parseDouble(JOptionPane.showInputDialog("SISTEMA DE NOTAS - v1 - Lançasmento de Notas\n\nInforme NOTA 01:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("SISTEMA DE NOTAS - v1 - Lançasmento de Notas\n\nInforme NOTA 02:"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("SISTEMA DE NOTAS - v1 - Lançasmento de Notas\n\nInforme NOTA 03:"));
		n4 = Double.parseDouble(JOptionPane.showInputDialog("SISTEMA DE NOTAS - v1 - Lançasmento de Notas\n\nInforme NOTA 04:"));
		
		if((mat<=0)||(n1<=0)||(n2<=0)||(n3<=0)||(n4<=0))
		{
			System.out.println("");
			System.out.println("Valores não informados!!!");
		}
		else
		{
			med = (n1+n2+n3+n4)/4;
			medTodos = medTodos + med;
			indLanc++;
			
			if(med<=5)
			{
				sit = "APROVADO";
				apTodos++;
			}
			else
			{
				sit = "REPROVADO";
				repTodos++;
			}

			JOptionPane.showMessageDialog(null, "Lancamento cadastrado com SUCESSO!!!\n\nMATRICULA: " + mat + "\nMEDIA: " + med + "\nSITUACAO: " + sit);
		}
		
		Menu();
	}
	
	public static void GeraLista()
	{
		JOptionPane.showMessageDialog(null, "LISTAGEM DE LANCAMENTOS\n\nQuant. de Cadastros: " + indAlunos + "\nQuant. de Lancamentos: " + indLanc + "\nMedia Geral: " + (medTodos/indLanc) + "\nQuant. de Aprovados: " + apTodos + "\nQuant. de Reprovados: " + repTodos);
		Menu();
	}
}