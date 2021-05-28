package demo;

public class Contador
{
    private int total;

    public Contador()
    {

    }

    public Contador(int total)
    {
        this.setTotal(total);
    }

    public Contador(Contador contador)
    {
        this.setTotal(contador.getTotal());
    }

    public void incrementar()
    {
        this.setTotal(this.getTotal() + 1);
    }

    public void decrementar()
    {
        this.setTotal(this.getTotal() - 1);
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


}
