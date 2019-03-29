public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
			boolean emprestado=false;
    public LivroDeBiblioteca(String n, String a, int ed) {
    	super(n,a,ed);
    }

    public String toString()
    {
    	String ret;
    	if(emprestado==true)
    	return ret=super.toString()+"Emprestado: Sim\n";
    	else return ret=super.toString()+"Emprestado: Não\n";
    }


    public void EmprestarItem() throws MinhaExcecao
    {
    	if(emprestado==true)
    		throw new MinhaExcecao("\nLivro indisponivel\n");
    	else
        {
    		emprestado=true;
                System.out.println("\nLivro emprestado com sucesso\n");       
        }
    }

    public void DevolverItem() throws MinhaExcecao
    {
    	if(emprestado==false)
    		throw new MinhaExcecao("\nLivro não emprestado\n");
   		else
                 {
   			emprestado=false;
                        System.out.println("\nLivro devolvido com sucesso\n");
                 }
    }

    public void VerificaEmprestado()
    {
    	if(emprestado==true)
    		System.out.println("\nO livro está emprestado\n");
    		else System.out.println("\nO livro não está emprestado\n");

    }
    public void TesteVetor()
    {
        
    }
 
            


}