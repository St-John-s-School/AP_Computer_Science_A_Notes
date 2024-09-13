public class Lab4Problem4_1 {
    public static void main(String[] args) {
        // This code defines five points and stores them as Strings

        String pointA = "(1,1)";
        String pointB = "(7,3)";
        String pointC = "(9,5)";
        String pointD = "(3,9)";
        String test_point = "(9,5)";

        // This code makes 10 variables to store the 10 x-, y-coordinates
        // We're going to store the test point as a double
        // This will make division involving the test point precise

        int x_A = pointA.charAt(1) - 48;
        int x_B = pointB.charAt(1) - 48;
        int x_C = pointC.charAt(1) - 48;
        int x_D = pointD.charAt(1) - 48;

        int y_A = pointA.charAt(3) - 48;
        int y_B = pointB.charAt(3) - 48;
        int y_C = pointC.charAt(3) - 48;
        int y_D = pointD.charAt(3) - 48;

        double x_test = test_point.charAt(1) - 48;
        double y_test = test_point.charAt(3) - 48; 
    
        // We'll make two booleans to represent whether the point
        // is on the boundary or inside the region, respectively. 

        boolean onBoundary = false;
        boolean isInside = false; 

        // Let's figure out whether the point is inside the region or not.
        // if our point is to the "left" of all four sides of the quadrilateral
        // then we know that it's inside the region.
        // We know that (y - y0) > or < (y1 - y0)/(x1 - x0)*(x - x0)
        // We create a formula to determine the position of the point relative to the sides

        // double AB will be greater than 0 if the point is left of the line AB
        // it will be 0 if the point is on the line 

        double AB = (y_test - y_A)*(x_B - x_A) - (y_B - y_A)*(x_test - x_A);
        double BC = (y_test - y_B)*(x_C - x_B) - (y_C - y_B)*(x_test - x_B);
        double CD = (y_test - y_C)*(x_D - x_C) - (y_D - y_C)*(x_test - x_C);
        double DA = (y_test - y_D)*(x_A - x_D) - (y_A - y_D)*(x_test - x_D);

        // If all four of the values are greater than 0, the point is inside
        if (AB > 0 && BC > 0 && CD > 0 && DA > 0)
        {
            isInside = true;
        }
        // If we're past the previous if statement, one value wasn't positive
        // But, if none are negative, we know we're not outside the region
        // Therefore, we are on the boundary. 
        else if (AB >= 0 && BC >= 0 && CD >= 0 && DA >= 0)
        {
            onBoundary = true;
        }

        if (isInside) 
        {
            System.out.println("inside");
        }
        else if (onBoundary)
        {
            System.out.println("boundary");
        }
        else 
        {
            System.out.println("outside"); 
        }
    }
}