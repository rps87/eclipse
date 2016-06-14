package controlador;

//import javax.naming.spi.ObjectFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Principal
{
	static String op;
	
	public static void main(String[] args)
	{
		Menu();
	}
	
	public static void Menu()
	{
		final JPanel painel = new JPanel();
		final JRadioButton op1 = new JRadioButton("Cadastro\n", false);
		final JRadioButton op2 = new JRadioButton("Lancamento\n", false);
		final JRadioButton op3 = new JRadioButton("Lista\n", false);
		
		painel.add(op1);
		painel.add(op2);
		painel.add(op3);
		
		//op1.addInputMethodListener(opcao1());
		
		//JOptionPane.showMessageDialog(null, painel, "SISTEMA DE NOTAS - v3", JOptionPane.DEFAULT_OPTION));
	}
	
	public static void opcao1()
	{
		JOptionPane.showMessageDialog(null, "Opcao 1 ESCOLHIDA", "SISTEMA DE NOTAS - v3", JOptionPane.DEFAULT_OPTION);
	}
	
	public static void opcao2()
	{
		JOptionPane.showMessageDialog(null, "Opcao 1 ESCOLHIDA", "SISTEMA DE NOTAS - v3", JOptionPane.DEFAULT_OPTION);
	}
	
	public static void opcao3()
	{
		JOptionPane.showMessageDialog(null, "Opcao 1 ESCOLHIDA", "SISTEMA DE NOTAS - v3", JOptionPane.DEFAULT_OPTION);
	}
}