package demo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Main {

    public static void main(String arg[])
    {
        System.out.println("-------Ejericio1---------");
        Ejercicio1();
        System.out.println("-------Ejericio2---------");
        Ejercicio2();
        System.out.println("-------Ejericio3---------");
        Ejercicio3();
        System.out.println("-------Ejericio4---------");
        Ejercicio4();
        System.out.println("-------Ejericio5---------");
        Ejercicio5();
        System.out.println("-------Ejericio6---------");
        Ejercicio6();
    }

    private static void Ejercicio1()
    {
        System.out.println("Transferecia 1-------");
        CuentaCorriente cuentaOrigen = new CuentaCorriente("01111022020", 10002);
        CuentaCorriente cuentaDestino = new CuentaCorriente("000002345", 10002);
        int monto = 100;

        cuentaOrigen.Transferir(monto, cuentaDestino);

        System.out.println("cuentaOrigen "+  cuentaOrigen.getNumeroDeCuenta() +", saldo: " + cuentaOrigen.getSaldo());
        System.out.println("cuentaDestinp: "+ cuentaDestino.getNumeroDeCuenta() +", saldo: " + cuentaDestino.getSaldo());

        System.out.println("Transferecia 2------");
        CuentaCorriente cuentaOrigenST = new CuentaCorriente("0555555", 10002);
        CuentaCorriente cuentaDestinoST = new CuentaCorriente("08888888", 10002);
        int montoST = 1000000;

        cuentaOrigenST.Transferir(montoST, cuentaDestinoST);

        System.out.println("cuentaOrigen "+  cuentaOrigenST.getNumeroDeCuenta() +", saldo: " + cuentaOrigenST.getSaldo());
        System.out.println("cuentaDestinp: "+ cuentaDestinoST.getNumeroDeCuenta() +", saldo: " + cuentaDestinoST.getSaldo());

        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    private static void Ejercicio2()
    {
        Contador primerContador = new Contador(0);
        primerContador.incrementar();
        primerContador.incrementar();
        primerContador.incrementar();

        System.out.println("Numero del primerContador: " + primerContador.getTotal());

        primerContador.decrementar();

        System.out.println("Numero del primerContador: " + primerContador.getTotal());

        Contador segundoContador = new Contador(primerContador);
        System.out.println("Numero del segundoContador: " + segundoContador.getTotal());

        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    private static void Ejercicio3()
    {
        Libro unLibro = new Libro("Harry Potter y la Piedra Filosofal", "0988733", "Rowling J.K.");

        unLibro.prestamo();
        System.out.println(unLibro.toString());
        System.out.println("Status del Libro: " + unLibro.getStatus());

        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    private static void Ejercicio4()
    {
        Fraccion primerFraccion = new Fraccion(2,3);
        Fraccion segundaFraccion = new Fraccion(2,3);

        //Sumas
        primerFraccion.sumar(segundaFraccion);
        System.out.println("Suma de la fraccion: " + primerFraccion.toString());

        primerFraccion.sumar(segundaFraccion.getNumerador());
        System.out.println("Suma de la fraccion: " + primerFraccion.toString());


        //Restas
        primerFraccion.restar(segundaFraccion);
        System.out.println("Resta de la fraccion: " + primerFraccion.toString());
        primerFraccion.restar(segundaFraccion.getNumerador());
        System.out.println("Resta de la fraccion: " + primerFraccion.toString());


        //Divisiones
        primerFraccion.dividir(segundaFraccion);
        System.out.println("Division de la fraccion: " + primerFraccion.toString());
        primerFraccion.dividir(segundaFraccion.getNumerador());
        System.out.println("Division de la fraccion: " + primerFraccion.toString());

        //Multiplicacion
        primerFraccion.multiplicar(segundaFraccion);
        System.out.println("Multiplicacion de la fraccion: " + primerFraccion.toString());
        primerFraccion.multiplicar(segundaFraccion.getNumerador());
        System.out.println("Multiplicacion de la fraccion: " + primerFraccion.toString());


        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    private static void Ejercicio5()
    {
        int dia= 13;
        int mes= 4;
        int ano= 2021;

        /*
         *Si la fecha es correcta Crea una instancia, en caso contrario devuelve null
         * el constructor se hace privado para que se instancie con el metodo statico createFecha
         * */
        Fecha fecha = Fecha.createFecha(dia,mes,ano);

        if(fecha != null)
        {
            fecha.setDia(dia);
            fecha.setMes(mes);
            fecha.setAno(ano);

            System.out.println(fecha.toString());

            fecha.agregarUnDia();

            System.out.println("Dia Siguiente: " + fecha.toString());
        }

        int dia2 = 29;
        int mes2 = 2;
        int ano2 = 2021;

        /*
         *Si la fecha es correcta Crea una instancia, en caso contrario devuelve null
         * el constructor se hace privado para que se instancie con el metodo statico createFecha
         * */
        Fecha fecha2 = Fecha.createFecha(dia2,mes2,ano2);

        if(fecha2 != null)
        {
            fecha.setDia(dia2);
            fecha.setMes(mes2);
            fecha.setAno(ano2);

            System.out.println(fecha2.toString());
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    private static void Ejercicio6()
    {
        /*
        *idem lpad, pero agregando caracteres a la derecha.
        * */
        System.out.println("Ejecucion metodo rpad");
        System.out.println(StringUtil.rpad("5",'0',3));


        /*
        *Quitar los espacios al principio
        * */
        System.out.println("Ejecucion metodo ltrim");
        String cadena = "   pru eba ";
        System.out.println("String inicial: " + cadena + "Tiene "+ cadena.length() +" caracteres");
        cadena = StringUtil.ltrim(cadena);
        System.out.println("String final: " + cadena + " Tiene "+ cadena.length() +" caracteres");


        //idem ltrim, pero sin espacios a la derecha.
        System.out.println("Ejecucion metodo rtrim");
        cadena = "   pru eba  ";
        System.out.println("String inicial: " + cadena + "Tiene "+ cadena.length() +" caracteres");
        cadena = StringUtil.rtrim(cadena);
        System.out.println("String final: " + cadena + " Tiene "+ cadena.length() +" caracteres");


        //idem ltrim, pero sin espacios a la derecha.
        System.out.println("Ejecucion metodo trim");
        cadena = "   pru eba  ";
        System.out.println("String inicial: " + cadena + "Tiene "+ cadena.length() +" caracteres");
        cadena = StringUtil.trim(cadena);
        System.out.println("String final: " + cadena + " Tiene "+ cadena.length() +" caracteres");


        /*
        *Retorna la posición de la n-ésima
        *ocurrencia del carácter c dentro de s, o -1 si s no contiene a c. Por ejemplo, si s = “John|Paul|George|Ringo”, c = ‘|’ y n=2, la función debe retornar la posicióon de la
        *segunda ocurrencia del carácter ‘|’ (pipe) dentro de la cadena s. Que, en este caso, es: 9.
        *
        * */
        String s = "John|Paul|George|Ringo";
        char c = '|';
        int n=2;

        System.out.println("Ejecucion metodo indexOfN con los parametros s=" + s + ", c= " + c + ", n= " + n);
        int resultado = StringUtil.indexOfN(s,c,n);
        System.out.println("Resultado es: " + resultado);

        //En este caso no hay segunda ocurrencia entonces devuelve -1
        s = "John|Paul|George|Ringo";
        c = 'h';
        n=2;
        System.out.println("Ejecucion metodo indexOfN con los parametros s=" + s + ", c= " + c + ", n= " + n);
        resultado = StringUtil.indexOfN(s,c,n);
        System.out.println("Resultado es: " + resultado);


    }
}
