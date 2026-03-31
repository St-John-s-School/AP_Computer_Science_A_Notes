public class b_LinearSearch
{
    public static void main(String[] args)
    {
    /*
    The first search algorithm we'll learn is linear search.

    Start at the beginning of the array, and check each element
    one at a time until you find what you're looking for.

    Linear Search is simple, and always works
    */

    int[] numbers = {14, 27, 3, 42, 8, 19, 35, 6};

    System.out.println(linearSearch(numbers, 19));
    System.out.println(linearSearch(numbers, 100));

    /*
    If the array has n elements, how many elements might we have to 
    check in the worst case?

    We say that Linear Search has a worst case of n comparisons.
    
    If the array has n elements, how many elements might we have to check
    in the best case?

    */

    }

    public static int linearSearch(int[] arr, int target)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == target)
            {
                return i;
            }
        }
        return -1; 
    }
}