class Student
{
    int id;
    String name;

    //constructor for initialization
    Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    //overriding String Method
    public String toString()
    {
        return "Student[id= "+this.id +", name = "+ this.name+"]";
    }
}
public class Inheritance {
    public static void main(String[] args)
    {
        Student s1 = new Student(100, "Rahul");
        Student s2 = new Student(101, "Joseph");
        System.out.println(s1);
        System.out.println(s2);
    }
}