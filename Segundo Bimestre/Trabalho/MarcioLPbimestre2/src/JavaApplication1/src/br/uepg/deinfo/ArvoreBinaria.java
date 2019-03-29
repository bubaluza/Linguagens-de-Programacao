package br.uepg.deinfo;

import java.util.Set;
import java.util.TreeSet;

public class ArvoreBinaria {


    private Set<Integer> arvore = new TreeSet();

    public void push(int valor) {
        arvore.add(valor);
        
    }

    public void pop(int valor) {
        arvore.remove(valor);
    }

    public boolean vazia() {
        if (arvore.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
