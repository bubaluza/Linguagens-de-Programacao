package br.uepg.deinfo.primeiro;

import javax.swing.JOptionPane;

public class Vetor {

    Pessoa vetor[] = new Pessoa[2];
    private int quantidade = 0;

    public void incluirPessoa() {
        vetor[quantidade] = new Pessoa(quantidade);
        String nome=JOptionPane.showInputDialog(null, "Digite o nome da pessoa: ", "inclusão", JOptionPane.QUESTION_MESSAGE);
        String temp = JOptionPane.showInputDialog(null, "Digite o salario: ", "inclusão", JOptionPane.QUESTION_MESSAGE);
        int salario = Integer.parseInt(temp);
    }
}
