package br.uepg.deinfo;

import java.util.LinkedList;
import java.util.List;

public class Pilha {

    private List<Integer> pilha = new LinkedList();

    public void push(int valor) {
        pilha.add(0, valor);
    }

    public void pop() {
        if(vazia())
            return;
        pilha.remove(0);
    }

    public Integer topoPilha() {
        return pilha.get(0);
    }
    
    public boolean vazia()
    {
        if(pilha.isEmpty())
            return true;
                    else return false;
    }
}
