public class Principal {

    public static void main(String[] args) {
       FiguraGeometrica vetor[]= new FiguraGeometrica[3];
       vetor[0]=new Quadrado(21);
       vetor[1]=new Retangulo(11,21);
       vetor[2]=new Circulo(3);

       for(int i=0;i<3;i++)
       {
       	FiguraEscalavel temp;
       	temp=(FiguraEscalavel)vetor[i];
       	temp.diminuirObjeto(1);
       	System.out.println(vetor[i]);
       }
    }
}
