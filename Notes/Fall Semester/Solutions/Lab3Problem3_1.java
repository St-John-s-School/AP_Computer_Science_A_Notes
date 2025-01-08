public class Lab3Problem3_1
{
    public static void main(String[] args)
    {
        String s = "test string please ignore";
        int old_length = s.length();
        String new_s = s.replace(" ", "");  
        int new_length = new_s.length();
        System.out.println((old_length - new_length) + " spaces"); 
    }
}