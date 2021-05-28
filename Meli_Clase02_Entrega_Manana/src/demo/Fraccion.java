package demo;

public class Fraccion
{
    private int numerador;
    private int denominador;

    public Fraccion(int n, int d)
    {
        this.numerador =n;
        this.setDenominador(d);
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

    @Override
    public String toString()
    {
        return numerador + "/" + denominador;
    }

    public void setDenominador(int denominador) {
        if(denominador == 0)
        {
            throw new RuntimeException("El denominador no puede ser 0");
        }
        this.denominador = denominador;
    }

    public Fraccion sumar(Fraccion x)
    {
        int nuevoDenominador = denominador * x.denominador;
        int nuevoNumerador = numerador * x.denominador + x.numerador*denominador;

        this.denominador = nuevoDenominador;
        this.numerador = nuevoNumerador;

        return this;
    }

    public Fraccion sumar(int numero)
    {
        int nuevoDenominador = denominador * 1;
        int nuevoNumerador = numerador * 1 + numero *denominador;

        this.denominador = nuevoDenominador;
        this.numerador = nuevoNumerador;

        return this;
    }



    public Fraccion restar(int numero)
    {
        int nuevoDenominador = denominador * 1;
        int nuevoNumerador = numerador * 1 - numero * denominador;

        this.denominador = nuevoDenominador;
        this.numerador = nuevoNumerador;

        return this;
    }

    public Fraccion restar(Fraccion x)
    {
        int nuevoDenominador = denominador * x.denominador;
        int nuevoNumerador = numerador * x.denominador - x.numerador * denominador;

        this.denominador = nuevoDenominador;
        this.numerador = nuevoNumerador;

        return this;
    }

    public Fraccion multiplicar(int numero)
    {
        int nuevoDenominador = denominador * 1;
        int nuevoNumerador = numerador * numero;

        this.denominador = nuevoDenominador;
        this.numerador = nuevoNumerador;

        return this;
    }

    public Fraccion multiplicar(Fraccion x)
    {
        int nuevoDenominador = denominador * x.denominador;
        int nuevoNumerador = numerador * x.numerador;

        this.denominador = nuevoDenominador;
        this.numerador = nuevoNumerador;

        return this;
    }

    public Fraccion dividir(int numero)
    {
        int nuevoDenominador = denominador * numero;
        int nuevoNumerador = numerador * 1;

        this.denominador = nuevoDenominador;
        this.numerador = nuevoNumerador;

        return this;
    }

    public Fraccion dividir(Fraccion x)
    {
        int nuevoDenominador = denominador * x.numerador;
        int nuevoNumerador = numerador * x.denominador;

        this.denominador = nuevoDenominador;
        this.numerador = nuevoNumerador;

        return this;
    }


}
