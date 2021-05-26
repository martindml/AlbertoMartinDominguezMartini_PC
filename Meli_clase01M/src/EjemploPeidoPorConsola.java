import java.util.Scanner;

public class EjemploPeidoPorConsola
{
    public static void main(String arg[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dos valores enteros: " );
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(b != 0)
        {
            double c = a/(double)b;
            System.out.println(a + "/" + b + "=" + c);
        }
        else
        {
            System.out.println("Error! no se puede dividir entre 0" );
        }



    }

}
