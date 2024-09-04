public class Lab2Problem4_2{
    public static void main(String[] args)
    {
        int a = 1; int b = 2; int c= 4;
        double mean = (a+b+c)/3.0; 
        double min = Math.min(Math.min(a,b),c);
        double max = Math.max(Math.max(a,b),c);
        double median = a+b+c-max-min;
        System.out.println("median: " + median);
        System.out.println("mean: " + mean);  
    }
  }