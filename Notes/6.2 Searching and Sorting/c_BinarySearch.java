public class c_BinarySearch
{
    public static void main(String[] args)
    {
    /*
    Now let's talk about binary search. It's much faster
    because it requires less comparisons. However,
    the array must be sorted for binary search to work. 

    The idea is simple. Think about how you'd look up a word
    in a physical dictionary:
    1) Open to the middle.
    2) Is the word you're looking for before or after this page?
    3) Eliminate the half you don't need.
    4) Repeat.

    */

    int[] sorted = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72, 91};

    System.out.println(binarySearch(sorted, 23));
    System.out.println(binarySearch(sorted, 50));

    /*
    How fast is Binary Search?

    Calculate the number of comparisons we did for the above two examples. 
    */

    /*
    Q: Why does the array need to be sorted?
    */
    }

    public static int binarySearch(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high)
        {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
            {
                return mid;
            }
            else if (arr[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return -1; // target was not found
    }
}