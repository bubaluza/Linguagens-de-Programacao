
import java.util.TreeSet;

public class LoginNovo {

    private TreeSet<Integer> arvore = new TreeSet();

    public LoginNovo() {
    }

    public void acessar(int codigo, int op) {
        if (op == 1) {
            arvore.add(codigo);
        }
        if (op == 0) {
            arvore.remove(codigo);
        }
    }

    public void informar(int codigo) {
        if (codigo == 0) {
            for (Integer ar : arvore) {
                System.out.println("O usuario " + ar + " está logado.");
            }
            System.out.println("");
        } else if (arvore.contains(codigo)) {
            System.out.println("O usuario " + codigo + " esta logado.\n");
        } else {
            System.out.println("O usuario " + codigo + " não está logado.\n");
        }
    }
}
