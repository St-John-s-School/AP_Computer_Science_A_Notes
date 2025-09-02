public class c_MoreOperators
{
/*
There are a few more operators we need.
They're called logical operators,
because they combine logical statements. 

&& (and)
|| (or)
! (not)

&& "and" outputs true if the two inputs are both true.
It outputs false otherwise.

|| "or" outputs true if at least one of the two inputs
are true.
It outputs false otherwise.

! outputs true if the input is false.
And false otherwise.
*/
    public static void main(String[] args)
    {
    System.out.println("--------------------- \n");

    boolean isSunny = true;
    boolean isWarm = true;
    boolean isNice = isSunny && isWarm;
    System.out.println("Is it nice (sunny AND warm)? " + isNice);

    System.out.println("\n---------------------");

    // System.out.println("--------------------- \n");
    // boolean hasUmbrella = true;
    // boolean hasRaincoat = false;
    // boolean isPrepared = hasUmbrella || hasRaincoat;
    // System.out.println("Are you prepared? (either umbrella or raincoat) "
    //  + isPrepared);
    // System.out.println("\n---------------------");

    // System.out.println("---------------------\n");
    // boolean isTall = false;
    // boolean isShort = !isTall;
    // System.out.println("Are you short? (not tall) " + isShort);
    // System.out.println("\n---------------------");

    }
}