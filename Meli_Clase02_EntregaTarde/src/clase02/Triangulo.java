package clase02;

public class Triangulo extends FiguraGeometrica{
    @Override
    public double area() {
        return base*altura/2;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Triangulo" ;
    }

    private int base;
    private int altura;

    public Triangulo(int b,int h)
    {
        base = b;
        altura = h;
    }

}