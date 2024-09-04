public class Lab2Problem4_1{
    public static void main(String[] args)
    {
    int a = 9;
    int b = 5;
    int c = 12;
    int sum = a + b + c;
    double mean = (sum)/3.0;

    int new_min = Math.min(a,b);
    int median = Math.max(new_min,c);
    
    System.out.println("mean "+ mean);
    System.out.println("median: "+ median);
    }
  }