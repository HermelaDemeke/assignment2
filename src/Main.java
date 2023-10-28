import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        //create Student objects
        Student student1=new Student("demeke",1,new int[]{85,90,95});
        Student student2=new Student("beletu",2,new int[]{87,89,99});
        //create Teacher objects
        Teacher teacher1=new Teacher("abeje","physics");
        Teacher teacher2=new Teacher("tigist","biology");
        //create College objects
        College college1=new College("Informatics",new ArrayList<Student>(),new ArrayList<Teacher>());
        // Add Student and Teacher objects to the college
        college1.getStudents().add(student1);
        college1.getStudents().add(student2);
        college1.getTeachers().add(teacher1);
        college1.getTeachers().add(teacher2);
        //print out details
       System.out.println("College Name: " + College.getName());
        System.out.println("Students:");
        for (Student s : College.getStudents()) {
            System.out.println("Name: " + s.getName());
            System.out.println("ID: " + s.getId());
            System.out.println("Grades: " + java.util.Arrays.toString(s.getGrades()));
            System.out.println();
        }
        System.out.println("Teachers:");
        for (Teacher t : College.getTeachers()) {
            System.out.println("Name: " + t.getName());
            System.out.println("Subject: " + t.getSubject());
            System.out.println();
        }

}

