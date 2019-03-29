package br.deinfo.uepg;

import java.util.TreeSet;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private String cpf;
    private int dia, mes, ano;

    public Pessoa(String nome, String cpf, int dia, int mes, int ano) {
        this.nome = nome;
        this.cpf = cpf;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String toString() {
        String ret = "Nome: " + nome + "\nCPF: " + cpf + "\nNascimento: " + dia + "/" + mes + "/" + ano + "\n\n";
        return ret;
    }

    @Override
    public int compareTo(Pessoa t) {
        if (ano != t.ano) {
            return ano - t.ano;
        }
        if (mes != t.mes) {
            return mes - t.mes;
        }
        return dia - t.dia;
    }

}
