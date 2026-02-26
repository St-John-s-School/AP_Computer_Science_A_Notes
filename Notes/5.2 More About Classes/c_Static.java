public class c_Static
{
    /*
    So far, every variable and method we've written in a Class
    has belonged to a specific Object. 

    But what if we want something that belongs to the Class itself,
    not any one Object? 

    Consider a Student Class. Every Student has a name and a grade,
    but there might be data that should be shared by all the Student objects.
    Basically, we want a variable that doesn't vary between each Student. 

    For example, the school they go to, or the total number of students.
    This data is not relevant to any particular student, but rather
    to all the students that were made by the same Class blueprint.

    This is where the keyword "static" comes in.
    */

    /*
    A "static" variable is shared across ALL objects of a class.
    This might remind us of static methods. A static method is one 
    that does not belong to an individual object. 

    In Student.java:
    - "name" and "grade" are instance variables (each Student has their own)
    - "schoolName" is static (all Students share one copy)
    - "totalStudents" is also static (counts ALL Students, not just one)
    */

    /*
    Reminder: A "static" method belongs to the Class, not to any specific Object.

    Key rules:
    1) Static methods CANNOT use instance variables
    2) Static methods CAN use static variables, though.
    3) Call them using the class name: Student.getTotalStudents()
    */

    public static void main(String[] args)
    {
        Student s1 = new Student("Ayush", 10);
        System.out.println("Total students: " + Student.getTotalStudents());

        Student s2 = new Student("Brayden", 10);
        System.out.println("Total students: " + Student.getTotalStudents());

        Student s3 = new Student("Campbell", 10);
        System.out.println("Total students: " + Student.getTotalStudents());

        /*
        Q: What would happen if totalStudents was an instance variable instead?
        Would our code work?
        */

        /*
        It is worth noting that if you change a Static variable,
        it will affect ALL the Objects of that class.
        */

        // Changing a static variable affects ALL objects.
        // Student.setSchoolName("Kinkaid");
        // System.out.println("School: " + Student.getSchoolName());

        /*
        Final note for this file, 
        you may see some variables with a final keyword.

        The keyword final makes a variable permanent.

        So, if we have:

        public static final double MAX_GPA = 100.0;

        the value of the MAX_GPA variable CANNOT change. 
        It's a constant! 
        */
    }
}