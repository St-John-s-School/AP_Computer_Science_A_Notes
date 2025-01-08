public class Lab1Problem3_2{
    public static void main(String[] args)
    {
    int temp = 76;
    double ctemp = (temp - 32) * 5.0 / 9;
    System.out.println("celsius = " + ctemp);
    double ftemp; 
    ftemp = (ctemp * 9 / 5) + 32;
    System.out.println("fahrenheit = " + ftemp);
    }
  }