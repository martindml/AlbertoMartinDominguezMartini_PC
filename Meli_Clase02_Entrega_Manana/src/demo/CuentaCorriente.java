package demo;

public class CuentaCorriente
{
    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    private String numeroDeCuenta;
    private int saldo;

    public CuentaCorriente()
    {

    }

    public CuentaCorriente(String numeroDeCuenta, int saldo)
    {
        this.setSaldo(saldo);
        this.setNumeroDeCuenta(numeroDeCuenta);
    }

    public void ingresar(int monto)
    {

        this.setSaldo(saldo + monto);

    }

    public boolean egresar(int monto)
    {
        if(monto > 0)
        {
            if((saldo - monto) < 0)
            {
                return false;
            }
            else
            {
                this.setSaldo(saldo - monto);
                return true;
            }
        }
        else
        {
            return false;
        }
    }

    public void reintegrar(int monto)
    {
        this.ingresar(monto);
    }

    public void Transferir(int monto, CuentaCorriente cuentaCorrienteDestino)
    {
        if(monto > 0)
        {
            if (!this.egresar(monto))
            {
                System.out.println("La cuenta Origen no tiene saldo suficiente");
            }
            else
            {
                try
                {
                    cuentaCorrienteDestino.ingresar(monto);
                    System.out.println("La transferencia se ha realizado correctamente.");
                    System.out.println("Se han transfereido desde la cuenta: " + this.numeroDeCuenta +" ==> $ " + monto + " ==> a la cuenta: " + cuentaCorrienteDestino.numeroDeCuenta);
                }
                catch(Exception ex)
                {
                    this.reintegrar(monto);
                    System.out.println("Ha ocurrido un error la transferencia se ha cancelado");
                }
            }
        }
        else
        {
            System.out.println("El monto a transferir debe ser mayor a 0. La transferencia no se ha realizado");
        }


    }

}
