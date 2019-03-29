
public abstract class CartãoWeb {
	private String remetente;
	private String destinario;
	private String data;
    public CartãoWeb(String rem,String dest,String dat) {
    	remetente=rem;
    	destinario=dest;
    	data=dat;
    }

    public abstract  void mostraMensagem();

    	public String getRemetente()
    {
    	return remetente;
    }

	    public String getDestinario()
    {
    	return destinario;
    }
        public String getData()
    {
    	return data;
    }

}