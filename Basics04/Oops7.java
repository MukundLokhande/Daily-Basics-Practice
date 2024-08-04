/*  Overriding : Method overriding is used to provide the 
specific implementation of the method 
that is already provided by its super class.*/

class Vehicle
{
    public void run()
    {
        System.out.println("Vehicle is running");
    }
}
class Bike extends Vehicle
{
    public void run()
    {
        System.out.println("Bike is running");
    }
}

    
public class Oops7 
{
    public static void main(String[] args)
    {
        Bike B = new Bike();
        B.run();
    }
}
