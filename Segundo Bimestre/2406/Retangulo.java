
public class Retangulo extends Quadrilatero {

    public Retangulo(int base, int altura) {
    	super(base, altura);
    }


    public String toString()
    {
    	String ret;
     	return	ret="base= "+getBase()+"\nAltura= "+getAltura()+"\nArea: "+calcularArea()+"\nPerimetro= "+calcularPerimetro()+"\n";
    }

     public boolean equals(Object o)
    {
    	if(o!=null && o instanceof Retangulo)
    	{
    		Retangulo outro=(Retangulo) o;
    		if((outro.getBase()==this.getBase()) &&( outro.getAltura()==this.getAltura()))
    			return true;
    	}
    	return false;
    }


}