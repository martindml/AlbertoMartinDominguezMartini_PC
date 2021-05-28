package clase02;

public class Circulo extends FiguraGeometrica{
    @Override
    public double area() {
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public String toString()
    {
        return super.toString() + "Circulo" ;
    }

    private int radio;

    public Circulo(int r)
    {
        radio = r;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}