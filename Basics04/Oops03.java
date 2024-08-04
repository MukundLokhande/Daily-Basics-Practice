//Constructors
// Default and para mereterised
class Student
{
    int age ;
    String name ;

    public void printINFO(){
        System.out.println(this.age);
        System.out.println(this.name);
    }

    Student()
    {
        System.out.println("This is Constructor");
    }
    Student(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

}
public class Oops03 {
public static void main(String[] args)
{
    Student s1 = new Student();
    
    Student s2 = new Student(23, "Mukund");
    s2.printINFO();

}
}
