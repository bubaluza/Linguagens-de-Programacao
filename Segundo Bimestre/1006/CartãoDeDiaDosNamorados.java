public class CartãoDeDiaDosNamorados extends CartãoWeb{

	public CartãoDeDiaDosNamorados(String a, String b, String c)
	{
		super(a,b,c);
	}
	    public  void mostraMensagem()
    {
		System.out.println(getData()+"\n\n\n"+getDestinario()+",\nFeliz Dia Dos Namorados meu Amor!!\n	  	 "+getRemetente()+"\n\n\n");
    }
}