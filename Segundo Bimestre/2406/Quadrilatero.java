public abstract class  Quadrilatero implements FiguraGeometrica, FiguraEscalavel {
		private double base;
		private double altura;

    public Quadrilatero(double a, double b) {
    	base=a;
    	altura=b;
    }

    public double calcularArea()
    {
    	return (base*altura);
    }

    public double calcularPerimetro()
    {
    	return ((base*2)+(altura*2));
    }

    public void diminuirObjeto(double sub)
    {
    	base=base-sub;
    	altura=altura-sub;
    }

    public void aumentarObjeto(double soma)
    {
    	base=base+soma;
    	altura=altura+soma;
    }

    public double getBase()
    {
    	return base;
    }
    public double getAltura()
    {
    	return altura;
    }



}