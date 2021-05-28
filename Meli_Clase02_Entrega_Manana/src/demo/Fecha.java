package demo;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha extends GregorianCalendar
{
 /*
 *La clase Fecha estiende de la clase GregorianCalendar para usar sus propiedades
 * El constructor de esta clase es privado y se hizo un metodo statico que antes
 * de crear una instancia se fija si la fecha es valida
 * */
    public int getDia() {
        if(this != null) {
            return this.get(Calendar.DAY_OF_MONTH);
        }
        else
        {
            return -1;
        }
    }

    public void setDia(int dia) {
        if(this != null)
        {
            this.set(Calendar.DAY_OF_MONTH, dia);
        }
    }

    public int getMes() {
        if(this != null)
        {
            return this.get(Calendar.MONTH) + 1;
        }
        else
        {
            return -1;
        }
    }

    public void setMes(int mes) {
        if(this != null)
        {
            this.set(Calendar.MONTH, mes - 1);
        }
    }

    public int getAno() {
        if(this != null)
        {
            return this.get(Calendar.YEAR);
        }
        else
        {
            return -1;
        }
    }

    public void setAno(int ano) {
        if(this != null)
        {
            this.set(Calendar.YEAR, ano);
        }
    }

    public static Fecha createFecha(int dia, int mes, int ano)
    {
        if(fechaCorrecta( dia,  mes,  ano))
        {
            return new Fecha( dia,  mes,  ano, 00,00);
        }
        else
        {
            return null;
        }
    }

    private Fecha(int dia, int mes, int ano, int horas, int minutos) {
        super(ano, mes, dia,horas, minutos);
    }

    @Override
    public String toString()
    {
        return this.getDia() + "/" + this.getMes() + "/" + this.getAno();
    }

    private static boolean fechaCorrecta(int dia, int mes, int ano)
    {
        try
        {
            LocalDate today = LocalDate.of(ano, mes, dia);
            System.out.print("Fecha correcta: ");
            return true;
        }
        catch(Exception ex)
        {
            System.out.print("Fecha incorrecta ");
            return false;
        }
    }

    public void agregarUnDia()
    {
       this.add(Calendar.DAY_OF_YEAR,1);
    }
}
