public abstract class Livro {
		private String nome;
		private String autor;
		private int edição;
		private int avaliação;
    public Livro(String nom, String aut, int edi) {
    	nome=nom;
    	autor=aut;
    	edição=edi;
    }

    public String toString()
    {
    	String ret;
    	return ret="\nNome do Livro: "+nome+"\nNome do Autor: "+autor+"\nEdição: "+edição+"\nAvaliação: "+avaliação+"\n";
    }

    public void Avalia(int nota) throws MinhaExcecao{
    	if(nota<0 || nota>10)
    		throw new MinhaExcecao("Nota Invalida");
    	else
    		avaliação=nota;
    }

}