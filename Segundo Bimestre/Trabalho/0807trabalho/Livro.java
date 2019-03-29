public abstract class Livro {
		private String nome;
		private String autor;
		private int ediçao;
		private int avaliação=5;
    public Livro(String nom, String aut, int edi) {
    	nome=nom;
    	autor=aut;
    	ediçao=edi;
    }

    public String toString()
    {
    	String ret;
    	return ret="Nome do Livro: "+nome+"\nNome do Autor: "+autor+"Edição: "+ediçao+"Avaliação: "+avaliação+"\n";
    }

    public void Avalia(int nota) throws MinhaExcecao{
    	if(nota<0 || nota>10)
    		throw new MinhaExcecao("Nota Invalida");
    	else
    		avaliação=nota;
    }

}