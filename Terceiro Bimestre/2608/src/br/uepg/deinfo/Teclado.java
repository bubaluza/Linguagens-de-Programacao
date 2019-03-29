package br.uepg.deinfo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Teclado extends JFrame {
    
    private JButton botão[];
    private JButton limpar;
    private JPanel painel;
    private JTextField visor;
    private Handler handler = new Handler();
    
    private void desenhaJanela() {
        setLayout(new BorderLayout(10,10));
        
        JPanel teclas = new JPanel();
        teclas.setLayout(new GridLayout(4, 3, 10, 10));
        botão = new JButton[12];
        botão[9]= new JButton("*");
        botão[10]= new JButton("0");
        botão[11]= new JButton("#");
        for (int i = 1; i < 10; i++) {
            botão[i - 1] = new JButton(String.valueOf(i));
            teclas.add(botão[i-1]);
        }
        teclas.add(botão[9]);
        teclas.add(botão[10]);
        teclas.add(botão[11]);
        
        
        
        painel =new JPanel();
        painel.setLayout(new BorderLayout());
        limpar = new JButton("limpar");
        
        limpar.setSize(20,10);
        painel.add(limpar,BorderLayout.CENTER);
        visor = new JTextField(15);
        visor.setEditable(false);
        visor.setBackground(Color.white);
        visor.setHorizontalAlignment(JTextField.RIGHT);
        painel.add(visor,BorderLayout.SOUTH);
        for(int i=0; i<12;i++)
        {
            botão[i].addActionListener(handler);
        }
        limpar.addActionListener(handler);
   
        
       
        add(teclas,BorderLayout.CENTER);
        add(painel,BorderLayout.SOUTH);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 350);
        setVisible(true);
    }
    private class Handler implements ActionListener{
        StringBuilder tela = new StringBuilder();
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==limpar){
              if(tela.length()!=0){
                tela.deleteCharAt(tela.length()-1);
                visor.setText(tela.toString());
              }
            }
            else{
                tela.append(e.getActionCommand());
                visor.setText(tela.toString());
            }
            
           
                
        }
        
        
    }
    
    public Teclado() {
        super("Teclado");
        desenhaJanela();
    }
    
    public static void main(String[] args) {
        new Teclado();
         
    }
    
}
