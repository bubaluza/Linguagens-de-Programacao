public class CartãoDeAniversario extends CartãoWeb{

		public CartãoDeAniversario(String a, String b, String c)
	{
		super(a,b,c);
	}
	    public  void mostraMensagem()
    {
		System.out.println(getData()+"\n\n\n"+getDestinario()+",\nFeliz Aniversario!\n	  	 "+getRemetente()+"\n\n\n");
    }
}