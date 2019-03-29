public class Quadrado extends Quadrilatero {

    public Quadrado(double lado) {
    	super(lado,lado);
    }


        public String toString()
    {
    	String ret;
  		return ret="Lado: "+getBase()+"\nArea: "+calcularArea()+"\nPerimetro= "+calcularPerimetro()+"\n";
    }

        public boolean equals(Object o)
    {
    	if(o!=null && o instanceof Quadrado)
    	{
    		Quadrado outro=(Quadrado) o;
    		if(outro.getBase()==this.getBase())
    			return true;
    	}
    	return false;
    }
}