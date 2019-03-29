package br.uepg.deinfo.primeiro;

public class Pessoa {

    private int codigo;
    private String nome;
    protected double salario;

    protected Pessoa(int codigo) {
        this.codigo = codigo;
    }

    protected int getCodigo() {
        return codigo;
    }

    protected String getNome() {
        return nome;
    }
    
    

    @Override
    public String toString() {
        return "codigo=" + codigo + ", nome=" + nome + ", salario=" + salario + "\n";
    }

}
