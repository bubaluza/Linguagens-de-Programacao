package br.uepg.deinfo;

import java.util.LinkedList;
import java.util.List;

public class ListaLinear {

    private int quant = 0;

    private List<Integer> lista = new LinkedList();

    public void push(int pos, int valor) {
        if ( pos > quant) {
            lista.add(quant, valor);
            quant++;
            return;
        }
        lista.add(pos, valor);
        quant++;
        return;
    }

    public void pop(int pos) {
        if (vazia()) {
            return;
        }
        if (pos > quant) {
            lista.remove(quant);
            quant--;
            return;
        }
        lista.remove(pos);
        quant--;
        return;
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();

        for (Integer i : lista) {
            resultado.append(i).append("  ");
        }

        return resultado.toString();
    }

    public boolean vazia() {
        if (lista.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
