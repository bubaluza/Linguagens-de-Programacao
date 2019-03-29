package br.uepg.deinfo;

import java.util.LinkedList;
import java.util.List;

public class Fila {

    private List<Integer> fila = new LinkedList();

    public void push(int valor) {
        fila.add(valor);
    }

    public void pop() {
        if(vazia())
            return;
        fila.remove(0);
    }

    public Integer topoFila() {
        return fila.get(0);
    }
    
    public boolean vazia()
    {
        if(fila.isEmpty())
            return true;
                    else return false;
    }
}
