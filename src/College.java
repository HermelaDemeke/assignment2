//create a class college with attribute
import java.util.ArrayList;
public class College{
    private static String name;
    private static ArrayList<Student> students;
    private static ArrayList<Teacher> teachers;
    //constructor
    public College(String name, ArrayList<Student> students, ArrayList<Teacher> teachers)
    {
        this.name = name;
        this.students = students;
        this.teachers = teachers;
    }

    //getter and setter for College attribute
    public static String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public static ArrayList<Student> getStudents()
    {
        return students;
    }
    public void setStudents(ArrayList<Student> students)
    {
        this.students = students;
    }
    public static ArrayList<Teacher> getTeachers()
    {
        return teachers;
    }
    public void setTeachers(ArrayList<Teacher> teachers)
    {
        this.teachers = teachers;
    }
}                                                                                                                                                                                                                              