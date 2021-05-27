package demo.fraccion;

public class Inicial
{
    public static void main(String[] args)
    {

        Fraccion f = new Fraccion(2,0);
        Fraccion g = new Fraccion(1,2);
        Fraccion h = new Fraccion(4,5);
        Fraccion i = new Fraccion(2,7);

        f.sumar(g).sumar(h).sumar(i);

        f.simplificar();

        f.imprimir();



    }

    public static void ejemplo1()
    {
        Fraccion f = new Fraccion(2,3);
        Fraccion g = new Fraccion(5,3);

        f.sumar(g);
        f.simplificar();

        f.imprimir();


        Fraccion x = Fraccion.sumar(f,g);

        x.imprimir();
    }

}
