// Polymorphism
// Method Overloading or Compile time 
class Student
{
    String name;
    int age;
    
    // by changing arguments
    public void printInfo(String name)
    {
        System.out.println(name);
    }
    public void printInfo(int age)
    {
        System.out.println(age);
    }
    public void printInfo(String name, int age)
    {
        System.out.println(name+" "+ age);
    }
    // by changing return type
    public double printInfo(String name, double age)
    {
        System.out.println(name+" "+ age);
        return age;
    }

    
}
class Oops5
{
public static void main(String[] args)
{
    Student s1 = new Student();
    
    s1.printInfo(23);
    s1.printInfo ("Mukund");
    s1.printInfo("Mukund", 23);
    s1.printInfo("Mukund", 23.0);
}
}
