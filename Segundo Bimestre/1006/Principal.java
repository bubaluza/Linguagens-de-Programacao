public class Principal{
	public static void main(String args[])
	{
		CartãoWeb vet[]= new CartãoWeb[5];
		vet[0]= new CartãoDeAniversario("Gabriel","mamãe","21/06/2016");
		vet[1]= new CartãoDeNatal("josé","Maria","25/12/2016");
		vet[2]= new CartãoDeDiaDosNamorados("Carlos","Gabriel","12/06/2016");
		vet[3]= new CartãoDeAniversario("Jose","Rodolfo","29/07/2016");
		vet[4]= new CartãoDeNatal("marnaldo","joselino","25/06/2016");

		for(CartãoWeb i : vet)
		{
			i.mostraMensagem();
		}
	}

}