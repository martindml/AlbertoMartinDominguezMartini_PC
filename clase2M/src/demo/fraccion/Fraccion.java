package demo.fraccion;

public class Fraccion
{
    private int numerador;
    private int denominador;

    public static final double PI = 3.4356456;

    // 2/3 + 4/5
    public Fraccion sumar(Fraccion x)
    {
        int nuevoDenominador = denominador * x.denominador;
        int nuevoNumerador = numerador * x.denominador + x.numerador*denominador;

        this.denominador = nuevoDenominador;
        this.numerador = nuevoNumerador;

        return this;
    }

    public Fraccion multiplicar(Fraccion f)
    {
        return null;
    }

    public Fraccion multiplicar(int x)
    {
        return null;
    }


    public void imprimir()
    {
        System.out.println(getNumerador()+ "/" + getDenominador());
    }

    public static Fraccion sumar(Fraccion a, Fraccion b)
    {
        Fraccion fraccion = new Fraccion(a.numerador,a.denominador);

        fraccion.sumar(b);
        return fraccion;
    }

    public void simplificar()
    {
        int i=2;

        while(i <= numerador && i <= denominador)
        {
            if(numerador %i == 0 && denominador %i == 0 )
            {
                numerador=numerador/i;
                denominador=denominador/i;
            }
            else
            {
                i++;
            }
        }
    }


    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public Fraccion()
    {

    }

    public Fraccion(int n, int d)
    {
        this.numerador =n;
        this.denominador =d;
    }



}
