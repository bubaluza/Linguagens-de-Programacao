package br.uepg.deinfo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Principal extends JFrame {

    private JMenuBar menu;
    private JMenu estruturas;
    private JMenuItem menupilha, menufila, sair;
    private JPanel painel;
    private JButton add, rem, print;
    private JTextField tadd, trem;
    private JTextArea texto;
    private Pilha pilha;
    private Fila fila;
    private Handler handler = new Handler();
    private int escolha = 8;

 //   private void desenhaJanelaErro(){
        
    
        
//        setLayout(new BorderLayout(5,5));
//         JTextField erro = new JTextField();
//         add(erro, BorderLayout.CENTER);
//         erro.setEditable(false);
//         erro.setText("Erro, ta dando treta veio");
//        
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(250, 250);
//        setVisible(true) ;
    //}
    
    private void desenhaJanela() {

        setLayout(new BorderLayout(5, 5));
        menu = new JMenuBar();
        estruturas = new JMenu("Estruturas");
        menupilha = new JMenuItem("Pilha");
        menupilha.addActionListener(handler);
        menufila = new JMenuItem("Fila");
        menufila.addActionListener(handler);
        sair = new JMenuItem("Sair");
        sair.addActionListener(handler);
        menu.add(estruturas);
        estruturas.add(menupilha);
        estruturas.add(menufila);
        estruturas.add(sair);

        setJMenuBar(menu);

        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout());

        add = new JButton("Adicionar");
        add.addActionListener(handler);
        rem = new JButton("Remover");
        rem.addActionListener(handler);
        print = new JButton("Imprimir");
        print.addActionListener(handler);
        tadd = new JTextField(10);
        tadd.addActionListener(handler);
        trem = new JTextField(10);
        trem.addActionListener(handler);
        painel.add(add);
        painel.add(tadd);
        painel.add(rem);
        painel.add(trem);
        painel.add(print);
        add(painel, BorderLayout.CENTER);
        texto = new JTextArea(4, 1);
        texto.setEditable(false);

        add(texto, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 250);
        setVisible(true);
    }

    private class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if (e.getSource() == menupilha) {
                if (pilha == null) {
                    pilha = new Pilha();
                }
                trem.setVisible(false);
                escolha = 1;
            }
            if (e.getSource() == menufila) {
                if (fila == null) {
                    fila = new Fila();
                }
                trem.setVisible(false);
                escolha = 2;
            }
            if(escolha==8)
            {
                JOptionPane.showMessageDialog(menu, "Escolha uma Estrutura");
            }
            if (escolha == 1) {
                if (e.getSource() == add || e.getSource() == tadd) {
                    pilha.push(Integer.parseInt(tadd.getText()));
                    tadd.setText("");
                }
                if (e.getSource() == rem || e.getSource() == trem) {
                    pilha.pop();
                }
                if (e.getSource() == print) {
                    if (pilha.vazia()) {
                        texto.setText("Pilha vazia");
                        return;
                    }

                    texto.setText("O topo da pilha é: " + Integer.toString(pilha.topoPilha()));
                }
            }
            if (escolha == 2) {
                if (e.getSource() == add || e.getSource() == tadd) {
                    fila.push(Integer.parseInt(tadd.getText()));
                    tadd.setText("");
                }
                if (e.getSource() == rem || e.getSource() == trem) {
                    fila.pop();
                }
                if (e.getSource() == print) {
                    if (fila.vazia()) {
                        texto.setText("Fila vazia");
                        return;
                    }

                    texto.setText("O topo da fila é: " + Integer.toString(fila.topoFila()));
                }
            }

        }

    }

    public Principal() {
        super("Estruturas");
        desenhaJanela();
    }

    public static void main(String[] args) {
        new Principal();
    }

}
