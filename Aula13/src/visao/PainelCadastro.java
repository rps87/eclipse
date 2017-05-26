package visao;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;
import modelo.Conexao;

public class PainelCadastro extends JPanel{
    
    public JLabel etiqueta;
    public JTextField txtNomCli;
    public JTextField txtEmailCli;
    public JTextField txtEndCli;
    public JTextField txtTelCli;
    
    public JButton btnCadastro;
    public JButton btnLimpar;
    public JButton btnVoltar;
    
    public PainelCadastro(){
        this.setLayout(null);
        
        etiqueta = new JLabel("Cadastro de Clientes");
        etiqueta.setBounds(50, 10, 180, 20);
        etiqueta.setFont(new Font("Arial", Font.BOLD, 16));
        this.add(etiqueta);
        
        etiqueta = new JLabel("Nome do Cliente:");
        etiqueta.setBounds(20, 50, 100, 20);
        this.add(etiqueta);
        
        txtNomCli = new JTextField(20);
        txtNomCli.setBounds(120, 50, 150, 20);
        this.add(txtNomCli);
        
        etiqueta = new JLabel("Email de Contato:");
        etiqueta.setBounds(20, 80, 100, 20);
        this.add(etiqueta);
        
        txtEmailCli = new JTextField(20);
        txtEmailCli.setBounds(120, 80, 150, 20);
        this.add(txtEmailCli);
        
        etiqueta = new JLabel("End. Completo:");
        etiqueta.setBounds(20, 110, 100, 20);
        this.add(etiqueta);
        
        txtEndCli = new JTextField(20);
        txtEndCli.setBounds(120, 110, 150, 20);
        this.add(txtEndCli);
        
        etiqueta = new JLabel("Tel. de Contato:");
        etiqueta.setBounds(20, 140, 100, 20);
        this.add(etiqueta);
        
        txtTelCli = new JTextField(20);
        txtTelCli.setBounds(120, 140, 150, 20);
        this.add(txtTelCli);
        
        btnCadastro = new JButton("Cadastra");
        btnCadastro.setBounds(30, 180, 100, 20);
        this.add(btnCadastro);
        
        btnLimpar = new JButton("Limpar");
        btnLimpar.setBounds(160, 180, 100, 20);
        this.add(btnLimpar);
        
        btnVoltar = new JButton("Voltar");
        btnVoltar.setBounds(150, 220, 100, 20);
        this.add(btnVoltar);
        
        btnCadastro.addMouseListener(new MouseListener() {
            @Override public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {
                try{
                    Cadastro();
                }catch(SQLException erro){
                    System.out.print(erro);
                }catch(ClassNotFoundException erro){
                    System.out.print(erro);
                }
            }
            @Override public void mouseReleased(MouseEvent e) {}
            @Override public void mouseEntered(MouseEvent e) {}
            @Override public void mouseExited(MouseEvent e){}
        });
        
        btnLimpar.addMouseListener(new MouseListener() {
            @Override public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {
                Limpar();
            }
            @Override public void mouseReleased(MouseEvent e) {}
            @Override public void mouseEntered(MouseEvent e) {}
            @Override public void mouseExited(MouseEvent e){}
        });
        
        btnVoltar.addMouseListener(new MouseListener() {
            @Override public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {
                FechaPainel();
            }
            @Override public void mouseReleased(MouseEvent e) {}
            @Override public void mouseEntered(MouseEvent e) {}
            @Override public void mouseExited(MouseEvent e){}
        });
    }
    
    public void FechaPainel(){
        this.setVisible(false);
    }
    
    public void Limpar(){
        txtNomCli.setText("");
        txtEmailCli.setText("");
        txtEndCli.setText("");
        txtTelCli.setText("");
    }
    
    public void Cadastro() throws SQLException, ClassNotFoundException{
        //coleta dados
        String nome = txtNomCli.getText();
        String email = txtEmailCli.getText();
        String endereco = txtEndCli.getText();
        String telefone = txtTelCli.getText();
        //Verificar os campos se estao vazios
        if((nome.equals(""))||(email.equals(""))||(endereco.equals(""))||(telefone.equals(""))){
            JOptionPane.showMessageDialog(null,"Campos Vazios!!!");
        }else{
            //Mandar para o banco
            Conexao cn = new Conexao();
            cn.Cadastra(nome, email, endereco, telefone);
            // limpar os campos
            Limpar();
            // mensagem ao usuario
            JOptionPane.showMessageDialog(null,"Cliente Cadastrado Com Sucesso!!!");
        }
    }
}
