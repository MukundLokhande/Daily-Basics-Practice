class Student
{
    String name;
    int age;

    public void printINFO()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class Oops02 
{
public static void main(String[] args)
{
    //new - new memory is allocated in memory heap
    Student S1 = new Student();
    S1.name = "Awadhoot";
    S1.age = 10;

    Student S2 = new Student();
    S2.age = 19;
    S2.name = "Priya";

    S1.printINFO();
    S2.printINFO();
    
}
    
}
