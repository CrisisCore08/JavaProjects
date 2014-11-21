public class MethodOverloading()
{

public static void(String[] args)
{
  myMethod(1,2,3);
}
public static int myMethod(int x, int y, int z)
{
  System.out.printf("%d%d%d, values are ", x, y, z);
}
public static double myMethod(double x, double y, double z);
{
  System.out.printf("%f%f%f values are ", x, y, z);
}
}
