public class Student
{
    // Instance Variables (each Student has their own copy)
    private String name;
    private int grade;

    // Static Variable (shared across ALL Student objects)
    private static String schoolName = "St. John's School";
    private static int totalStudents = 0;

    // Static Final Variable (a constant that belongs to the class and cannot change)
    public static final double MAX_GPA = 4.0;

    // Constructor
    public Student(String name, int grade)
    {
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    // Instance Methods (called on a specific Student Object)

    public String getName()
    {
        return name;
    }

    public int getGrade()
    {
        return grade;
    }

    public void setGrade(int grade)
    {
        this.grade = grade;
    }

    public boolean isSenior()
    {
        return grade == 12;
    }

    // Static Methods (belong to the Class, not any one Student)

    public static int getTotalStudents()
    {
        return totalStudents;
    }

    public static String getSchoolName()
    {
        return schoolName;
    }

    public static void setSchoolName(String newName)
    {
        schoolName = newName;
    }

    /*
    Q: Could getTotalStudents() use the variable "name"? Why or why not?

    Q: Could getName() use the variable totalStudents? Why or why not?

    Q: If we call setSchoolName("Kinkaid"), which Students are affected? Why?
    */
}