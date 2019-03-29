/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.deinfo.uepg;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author deinfo
 */
public class Login extends JFrame {

    private JTextField texto;
    private JLabel login, senha;
    private JButton ok, cancel;
    private JPasswordField pass;
    private Handler handler = new Handler();

    private void constroiJanela() {
        setLayout(new FlowLayout());
        login = new JLabel("Login");
        add(login);
        texto = new JTextField(20);
        texto.addActionListener(handler);
        add(texto);
        senha = new JLabel("Senha");
        add(senha);
        pass = new JPasswordField(20);
        add(pass);
        pass.addActionListener(handler);
        ok = new JButton("ok");
        ok.addActionListener(handler);
        add(ok);
        cancel = new JButton("cancel");
        cancel.addActionListener(handler);
        add(cancel);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == cancel) {
                System.exit(0);
            }
            if ((e.getSource() == texto || e.getSource() == pass) || (e.getSource() == ok)) {
                String l = "teste";
                String s = "teu";
                String r = new String(pass.getPassword());
                if (l.equals(texto.getText()) && (r.equals(s))) {
                    JOptionPane.showMessageDialog(rootPane, "bem vindo");
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Error 404, algo deu errado sec");
                    return;
                }

            }

        }
    }

    public Login() {
        super("Login");
        constroiJanela();
    }

    public static void main(String[] args) {
        new Login();

    }

}
