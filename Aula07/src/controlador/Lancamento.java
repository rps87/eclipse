package controlador;

import javax.swing.JOptionPane;

public class Lancamento
{
	static int indLanc;
	static int matLanc;
	static double n1;
	static double n2;
	static double n3;
	static double n4;
	static double med;
	static int apTodos;
	static int repTodos;
	static double medTodos;
	
	public static void MetodoLancamento()
	{
		String sit = "";

		matLanc = Integer.parseInt(JOptionPane.showInputDialog("SISTEMA DE NOTAS - v1 - Lançasmento de Notas\n\nInforme MATRÍCULA:"));
		n1 = Double.parseDouble(JOptionPane.showInputDialog("SISTEMA DE NOTAS - v1 - Lançasmento de Notas\n\nInforme NOTA 01:"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("SISTEMA DE NOTAS - v1 - Lançasmento de Notas\n\nInforme NOTA 02:"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("SISTEMA DE NOTAS - v1 - Lançasmento de Notas\n\nInforme NOTA 03:"));
		n4 = Double.parseDouble(JOptionPane.showInputDialog("SISTEMA DE NOTAS - v1 - Lançasmento de Notas\n\nInforme NOTA 04:"));
		
		if((matLanc<=0)||(n1<=0)||(n2<=0)||(n3<=0)||(n4<=0))
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

			JOptionPane.showMessageDialog(null, "Lancamento cadastrado com SUCESSO!!!\n\nMATRICULA: " + matLanc + "\nMEDIA: " + med + "\nSITUACAO: " + sit);
		}
		
		Menu.MetodoMenu();
	}	
}