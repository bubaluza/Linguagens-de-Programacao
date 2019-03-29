public class Circulo implements FiguraGeometrica, FiguraEscalavel {
		private double raio;

    public Circulo(double r) {
    	raio=r;
    }

    public double calcularArea()
    {
    	return (Math.PI*raio*raio);
    }

    public  double calcularPerimetro()
    {
    	return (Math.PI*2*raio);
    }

    public String toString()
    {
    	String ret;
    	return ret="raio= "+raio+"\nArea: "+calcularArea()+"\nPerimetro: "+calcularPerimetro()+"\n";
    }

    public  void diminuirObjeto(double sub)
    {
    	raio-=sub;
    }

    public  void aumentarObjeto(double soma)
    {
    	raio=raio+soma;
    }

    public boolean equals(Object o)
    {
    	if(o!=null && o instanceof Circulo)
    	{
    		Circulo outro=(Circulo) o;
    		if(outro.raio==this.raio)
    			return true;
    	}
    	return false;
    }


}