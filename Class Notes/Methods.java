public class Methods{
  public static void main(String[] args)
  {

    printHell();

    int result = add(5, 4);
    System.out.println(sum);
    System.out.println(result);


    double distance = distance(3, 3, 4, 4);
    
  }

  public static void printHello()
  {
    System.out.println("Hello!");
  }

  public static int add(int a, int b)
  {
    int sum = a + b;
    return a + b;
  }

  public static double distance(int x1, int y1, int x2, int y2)
  {
    double dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    return dist;
  }

  public static double distance(double x1, double y1, double x2, double y2)
  {
    double dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    return dist;
  }
  

  
}
