//create class student with attribute
public class Student {
    private String name;
    private int id;
    private int[] grades;
    //constructor
    public Student(String name,int id,int[] grades){
        this.name=name;
        this.id=id;
        this.grades=grades;
    }
    //getter and setter for students attribute

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int[] getGrades() {
        return grades;
    }
    public void setGrades(int[] grades){
        this.grades=grades;
    }



