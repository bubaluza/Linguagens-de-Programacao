public class Login {
    
    private int vetor[];

    
    public Login() {
        vetor=new int[20];
    }
    
    public void logar(int codigo) {
        if (codigo<vetor.length && vetor[codigo]==0)
            vetor[codigo]=1;
        else System.out.println("Erro!");    
    }
    
    public void deslogar(int codigo) {
        if (codigo<vetor.length && vetor[codigo]==1)
            vetor[codigo]=0;
        else System.out.println("Erro!");    
    }
    
    public void informar(int codigo) {
        if (codigo<vetor.length)
            if (vetor[codigo]==1)
                System.out.println("Usuário "+codigo+" logado");
            else System.out.println("Usuário "+codigo+" não logado");    
    }
    
    public void relatorio() {
        for (int i=0; i<vetor.length ; i++)
            if (vetor[i]==1)
                System.out.println("Usuário "+i+" logado");
    }
}