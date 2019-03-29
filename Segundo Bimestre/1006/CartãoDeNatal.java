public class CartãoDeNatal extends CartãoWeb{

		public CartãoDeNatal(String a, String b, String c)
	{
		super(a,b,c);
	}
	    public  void mostraMensagem()
    {
		System.out.println(getData()+"\n\n\n"+getDestinario()+",\nFeliz Natal ding ding!\n	  	 "+getRemetente()+"\n\n\n");
    }
}