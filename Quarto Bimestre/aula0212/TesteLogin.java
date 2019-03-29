public class TesteLogin {
    
    public static void main(String[] args) {
            
        Login log = LoginCreator.getInstancia(1);
        log.logar(2);
        log.logar(5);
        log.logar(7);
        log.logar(3);
        log.deslogar(3);
        log.informar(7);
        log.informar(1);
        log.relatorio();
        
    }
}