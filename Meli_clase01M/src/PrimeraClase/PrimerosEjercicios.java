package PrimeraClase;

import java.util.Scanner;

public class PrimerosEjercicios
{
    public static void main(String arg[])
    {
        ejericio5();

    }

    public static void ejericio1()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor enteros: " );
        int a = scanner.nextInt();
        String resultado = "los primeros numeros pares son: ";

        for(int i=0; i <= a; i = i+2)
        {
            resultado = resultado + i + ", ";
        }

        System.out.println( resultado);

    }

    public static void ejericio2()
    {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese dos numeros: " );
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        String resultado = "los primeros " + n + " múltiplos de " +  m  + " son: ";

        if(n > 0 && m > 0) {
            for (int i = 0; i <= n; i++) {
                if (i % m == 0) {
                    resultado = resultado + i + ", ";
                }
            }

            System.out.println(resultado);
        }
        else
        {
            System.out.println("n y m deben ser mayor a 0");
        }
    }

    public static void ejericio3()
    {

        //Tomo en cuenta que 1 y 0 no son primos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: " );
        int a = scanner.nextInt();
        boolean resultado = true;

            if(a == 2)
            {
                resultado = true;
            }
            else if (a%2==0 || a==1 || a==0)
            {
                resultado = false;
            }

            if(resultado) {
                for (int i = 3; i * i <= a; i += 2) {
                    if (a % i == 0) {
                        resultado = false;
                    }
                }
            }

            if(resultado)
            {
                System.out.println(a + " Es primo" );
            }
            else
            {
                System.out.println(a + " No es primo" );
            }

    }

    private static boolean esPrimo(int a)
    {
        boolean resultado = true;

        if(a == 2)
        {
            resultado = true;
        }
        else if (a%2==0 || a==1 || a==0)
        {
            resultado = false;
        }

        if(resultado) {
            for (int i = 3; i * i <= a; i += 2) {
                if (a % i == 0) {
                    resultado = false;
                }
            }
        }
        return resultado;
    }

    public static void ejericio4()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor enteros: " );
        int a = scanner.nextInt();

        String resultado = "";

        for(int i=0; i <= a; i++)
        {
            if(esPrimo(i))
            {
                resultado = resultado + i + ",";
            }
        }

        if(resultado == "")
        {
            System.out.println("No hay numeros primos" );
        }
        else
        {
            System.out.println("Los numeros primeros numeros primos menores o igual a " + a +" son:" + resultado);
        }
    }




    public static void ejericio5()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese tres valors valor enteros: " );
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();

        String result = "";

        int i = m;

        int cantidadDeNumeros = 0;

        int maximo = 2147483647;

        for(i=d; i <= maximo; i++ )
        {
            if(cantidadDeNumeros < n && tieneDigitos(m,d, i))
            {
                result = result + " " + i +", ";
                cantidadDeNumeros ++;
            }
            else if(cantidadDeNumeros == n)
            {
                break;
            }
        }


        System.out.println("Salida" + result );

    }

    private static boolean tieneDigitos(int cantidadDeRepeticiones, int numeroAEncontrar, int numeroARevisar)
    {
        boolean result = false;

        String sNumeroARevisar = String.valueOf(numeroARevisar);
        String sCantidadDeRepeticiones = String.valueOf(cantidadDeRepeticiones);
        String snumeroAEncontrar = String.valueOf(numeroAEncontrar);

         return -1 < sNumeroARevisar.indexOf(snumeroAEncontrar);

    }

}
