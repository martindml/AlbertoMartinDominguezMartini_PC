package clase02;

public class FiguraUtil
{
    public static double areaPromedio(FiguraGeometrica[] arr)
    {
        double sum=0;
        for(FiguraGeometrica fg:arr)
        {
            sum = sum+fg.area();
        }
        return sum/arr.length;
    }
}
