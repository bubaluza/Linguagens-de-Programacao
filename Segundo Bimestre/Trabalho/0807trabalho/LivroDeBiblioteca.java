public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
			boolean emprestado=false;
    public LivroDeBiblioteca(String n, String a, int ed) {
    	super(n,a,ed);
    }

    public String toString()
    {
    	String ret;
    	if(VerificaEmprestado())
    	return ret=super.toString()+"Emprestado: Sim\n";
    	else return ret=super.toString()+"Emprestado: Não\n";
    }


    public void EmprestarItem() throws MinhaExcecao
    {
    	if(emprestado==true)
    		throw new MinhaExcecao("Livro indisponivel");
    	else
    		emprestado=true;
    }

    public void DevolverItem() throws MinhaExcecao
    {
    	if(emprestado==false)
    		throw new MinhaExcecao("Livro não emprestado");
   		else
   			emprestado=false;
    }

    public boolean VerificaEmprestado()
    {
    	if(emprestado==true)
    		return true;
    		else return false;

    }


}