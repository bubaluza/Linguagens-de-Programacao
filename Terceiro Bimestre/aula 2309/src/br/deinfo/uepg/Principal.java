package br.deinfo.uepg;

import java.util.TreeSet;

public class Principal {
         
 
  
  public static void main(String[] args) {
        TreeSet <Pessoa> arvore = new TreeSet<>();
        Pessoa p1=new Pessoa("vagabundinho","123124124", 21,06,1997);
        Pessoa p2=new Pessoa("segundo vagabundinho","32131", 30,01, 1940);
        Pessoa p3=new Pessoa("terceiro vagabundinho","323",13,05,2008);
        
        arvore.add(p1);
        arvore.add(p2);
        arvore.add(p3);
        System.out.println(arvore);
    }
}
