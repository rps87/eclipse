package visao;

import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame {
    
    JMenuBar menuBarra;
    JMenu menuInicio;
    JMenuItem menuCadastro;
    JMenuItem menuSair;
    
    PainelCadastro pc = new PainelCadastro();
    
    public Menu(){
        // Construir a Tela Principal do Programa
        super("Aula 13 - Trabalhando com MenuBar");
        this.setBounds(500,200,350,350);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Inserir Menu Barra na Janela Principal
        adicMenu();
        
        // Agora sim, iremos acender a janela
        this.setVisible(true);
    }
    
    public void adicMenu(){
        menuBarra = new JMenuBar();
        menuInicio = new JMenu("Inicio");
        menuCadastro = new JMenuItem("Cadastro");
        menuSair = new JMenuItem("Sair");
        
        menuInicio.add(menuCadastro);
        menuInicio.add(menuSair);
        menuBarra.add(menuInicio);
        this.setJMenuBar(menuBarra);
        
        menuCadastro.addMouseListener(new MouseListener() {
            @Override public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {
                ChamaCadastro();
            }
            @Override public void mouseReleased(MouseEvent e) {}
            @Override public void mouseEntered(MouseEvent e) {}
            @Override public void mouseExited(MouseEvent e){}
        });
        
        menuSair.addMouseListener(new MouseListener() {
            @Override public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {
                System.exit(0);
            }
            @Override public void mouseReleased(MouseEvent e) {}
            @Override public void mouseEntered(MouseEvent e) {}
            @Override public void mouseExited(MouseEvent e){}
        });
    }
    
    public void ChamaCadastro(){
        pc.setVisible(true);
        this.setVisible(false);
        this.setContentPane(pc);
        this.setVisible(true);
    }
}
