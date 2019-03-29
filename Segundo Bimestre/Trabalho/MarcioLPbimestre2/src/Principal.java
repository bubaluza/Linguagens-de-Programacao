import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        final int TAM=3;

    	ItemDeBiblioteca vet[]= new LivroDeBiblioteca[TAM];
    	Scanner le = new Scanner(System.in);
        le.useDelimiter("\\n");
    	int cont=0;
    	int livros=0;
        int numero;



    	do
    	{
            try{
    		System.out.println("----------Sistema bibliotecas 3mil v2----------");
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
                                        if(livros==TAM)
                                        {
                                            System.out.println("\nSistema não suporta mais livros.\n");
                                            break;
                                        }
					String nome;
					String autor;					
					System.out.print("Digite o nome do livro: ");
					nome=le.next();
					System.out.print("Digite o nome do autor do livro: ");
					autor=le.next();
					System.out.print("Digite a edição do livro: ");
					numero=le.nextInt();
					vet[livros]=new LivroDeBiblioteca(nome, autor, numero);
                                        System.out.println("\nLivro cadastrado com sucesso\n");
                                        livros++;
                                        break;
                                case 2:              
                                        System.out.print("Digite o numero do livro a ser emprestado: ");
                                        numero=le.nextInt();
                                        vet[numero-1].EmprestarItem();                                     
                                        break;
                                case 3:
                                        System.out.print("Digite o numero do livro a ser devolvivo: ");
                                        numero=le.nextInt();
                                        vet[numero-1].DevolverItem();                                       
                                        break;
                                case 4:
                                        System.out.print("Digite o numero do livro a ser verificado: ");
                                        numero=le.nextInt();
                                        vet[numero-1].VerificaEmprestado();                                   
                                        break;
                                case 5:
                                        System.out.print("Digite o numero do livro a avaliado: ");
                                        numero=le.nextInt();
                                        vet[numero-1].TesteVetor();
                                        Livro temp;
                                        temp=(Livro)vet[numero-1];
                                        System.out.print("Digite a sua avaliação: ");
                                        numero=le.nextInt();
                                        temp.Avalia(numero); 
                                       
                                        break;
                                case 6:
                                        System.out.print("Digite o numero do livro a ter suas informções imprimidas: ");
                                        numero=le.nextInt();
                                        if(numero>livros || livros==0)
                                        {
                                            System.out.println("\nposição invalida\n");
                                            break;
                                        }
                                        System.out.println(vet[numero-1]);
                                        break;
                                case 7:
                                        if(livros==0)
                                        {
                                            System.out.println("\nNenhum livro cadastrado\n");
                                            break;
                                        }
                                        for(int i=0;i<livros;i++)
                                            System.out.println(vet[i]+"\n");
                                        break;

                        }
            }          
                        catch(InputMismatchException e)
                        {
                            System.out.println("\nDigite um numero inteiro\n");
                            le.nextLine();                
                        }
                        catch(MinhaExcecao e)
                        {
                            System.out.println("\n"+e.getMessage()+"\n");
                        }
                        catch(ArrayIndexOutOfBoundsException e)
                        {
                            System.out.println("\nPosicao do livro invalido\n");
                        }
                        catch(NullPointerException e)
                        {
                            System.out.println("\nPosicao do livro invalido\n");
                        }

    	}while(cont!=8);





    }
}
