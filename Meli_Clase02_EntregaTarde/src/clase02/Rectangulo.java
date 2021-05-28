package clase02;

public class Rectangulo extends FiguraGeometrica{
    @Override
    public double area() {
        return base*altura;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Rectangulo" ;
    }

    private int base;
    private int altura;

    public Rectangulo(int b,int h)
    {
        base = b;
        altura = h;
    }

}
