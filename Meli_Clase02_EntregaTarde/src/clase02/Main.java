package clase02;

import java.util.ArrayList;

public class Main {
    public static void main(String arg[])
    {
        System.out.println("Ejercicio1-----------");
        Ejercicio1();

        System.out.println("Ejercicio2-----------");
        Ejercicio2();
    }

    private static void Ejercicio1()
    {

        System.out.println("Agregando Password");
        try
        {
            Password passwordAlta1 = new PasswordSeguridadAlta("Martin2020*");
            Password passwordAlta2 = new PasswordSeguridadAlta("Martin2020");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            /*
            *Cuando se produce una excepcion, la misma se debe guardar en un lugar persistente
            * por ejemplo logs, dependiendo del sistema puede guardarse en base
            * En este caso solo la controlo para mostrarle un mensaje amistoso al usuario y no se rompa el sistema
            * */
        }

        try
        {
            Password passwordMedia1 = new PasswordSeguridadMedia("Martin2020");
            Password passwordMedia2 = new PasswordSeguridadMedia("martin2020");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            /*
             *Cuando se produce una excepcion, la misma se debe guardar en un lugar persistente
             * por ejemplo logs, dependiendo del sistema puede guardarse en base
             * En este caso solo la controlo para mostrarle un mensaje amistoso al usuario y no se rompa el sistema
             * */
        }

        try
        {
            Password passwordBaja1 = new PasswordSeguridadBaja("Ma20");
            Password passwordBaja2 = new PasswordSeguridadBaja("Marrr");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            /*
             *Cuando se produce una excepcion, la misma se debe guardar en un lugar persistente
             * por ejemplo logs, dependiendo del sistema puede guardarse en base
             * En este caso solo la controlo para mostrarle un mensaje amistoso al usuario y no se rompa el sistema
             * */
        }


        System.out.println("Modificando Password");



        try
        {
            Password passwordAlta1 = new PasswordSeguridadAlta("Martin2020*");
            passwordAlta1.setValue("Martin2021*");
            passwordAlta1.setValue("Martin");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            /*
             *Cuando se produce una excepcion, la misma se debe guardar en un lugar persistente
             * por ejemplo logs, dependiendo del sistema puede guardarse en base
             * En este caso solo la controlo para mostrarle un mensaje amistoso al usuario y no se rompa el sistema
             * */
        }


        try
        {
            Password passwordMedia1 = new PasswordSeguridadMedia("Martin2020");
            passwordMedia1.setValue("martin2021");
            passwordMedia1.setValue("mar");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            /*
             *Cuando se produce una excepcion, la misma se debe guardar en un lugar persistente
             * por ejemplo logs, dependiendo del sistema puede guardarse en base
             * En este caso solo la controlo para mostrarle un mensaje amistoso al usuario y no se rompa el sistema
             * */
        }

        try
        {
            Password passwordBaja1 = new PasswordSeguridadBaja("Ma20");
            passwordBaja1.setValue("Martin2021*");
            passwordBaja1.setValue("M");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            /*
             *Cuando se produce una excepcion, la misma se debe guardar en un lugar persistente
             * por ejemplo logs, dependiendo del sistema puede guardarse en base
             * En este caso solo la controlo para mostrarle un mensaje amistoso al usuario y no se rompa el sistema
             * */
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    private static void Ejercicio2()
    {
        Circulo circulo = new Circulo(120);
        Rectangulo rectangulo = new Rectangulo(5,3);
        Triangulo triangulo = new Triangulo(4,6);

        FiguraGeometrica[] arr={circulo,rectangulo,triangulo};

        double resultado = FiguraUtil.areaPromedio(arr);
        System.out.println("El promedio de las areas es: " + resultado);
    }

}
