import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

    	ItemDeBiblioteca vet[]= new LivroDeBiblioteca[10];
    	Scanner le = new Scanner(System.in);
    	int cont=0;
    	int livros;



    	while(cont!=8)
    	{
    		System.out.println("----------Sistema bibliotecas 3mil v2------------");
    		System.out.println("1-Cadastrar Livro");
    		System.out.println("2-Emprestar Livro");
    		System.out.println("3-Devolver Livro");
    		System.out.println("4-Verificar se o livro está Emprestado");
    		System.out.println("5-Avaliar livro");
    		System.out.println("6-Imprimir informações de um livro");
    		System.out.println("7-Imprimir informações dos livros da biblioteca");
    		System.out.println("8-Sair");
			System.out.print(" Escolha uma opção: ");
			cont=le.nextInt();
			switch(cont)
			{
				case 1:

					String nome;
					String autor;
					int edição;
					System.out.print("Digite o nome do livro: ");
					nome=le.next();
					System.out.print("Digite o nome do autor do livro: ");
					autor=le.next();
					System.out.print("Digite a edição do livro: ");
					edição=le.nextInt();
					vet[livros+1]=new LivroDeBiblioteca(nome, autor, edição);


			}

    	}





    }
}
