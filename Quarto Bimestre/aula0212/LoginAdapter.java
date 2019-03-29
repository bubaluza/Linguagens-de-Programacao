
public class LoginAdapter extends Login {

    private LoginNovo lo;

    public LoginAdapter(){
        lo = new LoginNovo();
    }
    @Override
    public void logar(int codigo){
        lo.acessar(codigo, 1);
    }
    @Override
    public void deslogar(int codigo){
        lo.acessar(codigo, 0);
    }
    @Override
    public void informar(int codigo){
        lo.informar(codigo);
    }
    @Override
    public void relatorio(){
        lo.informar(0);
    }
           
}   
